package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.edit.camera.CameraView;
/* compiled from: PG */
/* renamed from: zms  reason: default package */
/* loaded from: classes4.dex */
public class zms extends FrameLayout implements axoo {
    private axok a;
    private boolean b;

    zms(Context context) {
        super(context);
        T();
    }

    @Override // defpackage.axoo
    /* renamed from: S */
    public final axok lH() {
        if (this.a == null) {
            this.a = new axok(this, false);
        }
        return this.a;
    }

    protected final void T() {
        if (!this.b) {
            this.b = true;
            ((zmc) lI()).a((CameraView) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    public zms(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        T();
    }

    zms(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T();
    }

    zms(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        T();
    }
}
