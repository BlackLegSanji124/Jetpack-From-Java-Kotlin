

package com.kunminx.jetpack_java.sample_04_databinding.ui.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.kunminx.jetpack_java.R;
import com.kunminx.jetpack_java.common_data.bean.Moment;
import com.kunminx.jetpack_java.common_ui.adapter.DiffUtilCallbacks;
import com.kunminx.jetpack_java.databinding.AdapterMomentDatabindingBinding;
import com.kunminx.architecture.ui.adapter.SimpleBindingAdapter;

/**
 * TODO：本示例专注于提供 DataBinding 组件的使用场景和示例，因而其他内容均保持 Android 引入 Jetpack 前的模样，
 * kotlin 模块提供同样的场景和基于 Kotlin 的写法，可对照查阅。
 * 并且本项目的示例从 sample_01 到 sample_05 是循序渐进地 Jetpack 化，
 * 如看完对 Jetpack 高频核心组件 "为什么要用"、"为什么要这样用" 有了一丝丝好奇心，可前往《Jetpack MVVM 精讲》和《Jetpack MVVM 最佳实践》项目查阅深度解析。
 * <p>
 * https://juejin.im/post/5dafc49b6fb9a04e17209922
 * <p>
 * https://github.com/KunMinX/Jetpack-MVVM-Best-Practice
 * <p>
 * <p>
 * Create by KunMinX at 2020/5/31
 */
public class DataBindingMomentAdapter extends SimpleBindingAdapter<Moment, AdapterMomentDatabindingBinding> {

    public DataBindingMomentAdapter(Context context) {
        super(context, R.layout.adapter_moment_databinding, new DiffUtilCallbacks().getMomentItemCallback());
    }

    @Override
    protected void onBindItem(AdapterMomentDatabindingBinding binding, Moment item, RecyclerView.ViewHolder holder) {
        binding.setMoment(item);
    }
}
