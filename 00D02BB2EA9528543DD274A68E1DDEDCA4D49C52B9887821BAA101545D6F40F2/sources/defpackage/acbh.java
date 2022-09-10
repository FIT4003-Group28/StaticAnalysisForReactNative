package defpackage;

import android.app.Application;
import android.view.View;
/* compiled from: PG */
/* renamed from: acbh  reason: default package */
/* loaded from: classes2.dex */
public class acbh extends acbe implements acay {
    public static final cqtd a = cqrt.h(2131232472, ire.x());
    private final bdvc b;

    public acbh(dwfl dwflVar, View.OnClickListener onClickListener, String str, String str2, int i, Application application, bdvd bdvdVar) {
        super(dwflVar, onClickListener, application, str, str2, i);
        this.b = bdvdVar.a(dwflVar);
    }

    @Override // defpackage.acay
    public View.OnAttachStateChangeListener a() {
        return this.b.h;
    }

    @Override // defpackage.acba
    public Float e() {
        return Float.valueOf(1.0f);
    }

    @Override // defpackage.acbe, defpackage.acba
    public cqtd j() {
        return a;
    }
}
