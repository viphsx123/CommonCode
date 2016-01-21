package com.hsx.commoncode.util;

import android.util.SparseArray;
import android.view.View;

/**
 * ViewHolder公用的简洁写法
 *
 * <b>Sample usages</b>
 *
 * <pre>
 * {@code
 * public View getView(int position, View convertView, ViewGroup parent) {
 * 	if (convertView == null) {
 * 		convertView = LayoutInflater.from(context).inflate(R.layout.banana_phone, parent, false);
 * 	}
 * 	ImageView bananaView = ViewHolderUtil.get(convertView, R.id.banana);
 * 	TextView phoneView = ViewHolderUtil.get(convertView, R.id.phone);
 * 	BananaPhone bananaPhone = getItem(position);
 * 	phoneView.setText(bananaPhone.getPhone());
 * 	bananaView.setImageResource(bananaPhone.getBanana());
 * 	return convertView;
 * }
 * </pre>
 *
 * @author Doraemon
 * @time 2014年8月28日上午11:45:45
 * Summary:ViewHolder通用写法
 */
public class ViewHolderUtil {

    @SuppressWarnings("unchecked")
    public static <T extends View> T get(View view, int id) {
        SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
        if (viewHolder == null) {
            viewHolder = new SparseArray<View>();
            view.setTag(viewHolder);
        }
        View childView = viewHolder.get(id);
        if (childView == null) {
            childView = view.findViewById(id);
            viewHolder.put(id, childView);
        }
        return (T) childView;
    }

}
