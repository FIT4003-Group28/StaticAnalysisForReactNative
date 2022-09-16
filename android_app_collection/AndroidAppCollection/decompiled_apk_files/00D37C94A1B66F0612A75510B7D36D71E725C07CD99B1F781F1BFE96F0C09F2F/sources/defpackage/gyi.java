package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
/* compiled from: PG */
/* renamed from: gyi  reason: default package */
/* loaded from: classes3.dex */
public final class gyi extends zmu {
    public gyi(Context context, zmb zmbVar, View view, acti actiVar) {
        super(context, zmbVar, view, actiVar, null);
    }

    @Override // defpackage.zmu
    protected final Drawable a() {
        return ((EditorButtonView) this.a).b.getDrawable();
    }

    @Override // defpackage.zmu
    protected final View b() {
        return ((EditorButtonView) this.a).b;
    }

    @Override // defpackage.zmu
    protected final actj c() {
        return actj.SHORTS_CREATION_SWITCH_CAMERA_BUTTON;
    }

    @Override // defpackage.zmu
    protected final void d() {
    }
}
