package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: llf  reason: default package */
/* loaded from: classes3.dex */
public final class llf extends FrameLayout {
    public final NumberPicker a;
    public List b;

    public llf(Context context) {
        super(context, null, 0);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        inflate(context, R.layout.setting_time_picker, this);
        this.a = (NumberPicker) findViewById(R.id.time_picker);
    }

    public final int a() {
        return this.a.getValue();
    }

    public final void b(String str) {
        if (this.b.contains(str)) {
            this.a.setValue(this.b.indexOf(str));
        }
    }

    public final void c(List list) {
        if (!list.isEmpty()) {
            this.b = list;
            NumberPicker numberPicker = this.a;
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(list.size() - 1);
            numberPicker.setDisplayedValues((String[]) arey.x(list, String.class));
        }
    }
}
