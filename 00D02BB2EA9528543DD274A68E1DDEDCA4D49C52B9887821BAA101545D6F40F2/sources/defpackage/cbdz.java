package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbdz  reason: default package */
/* loaded from: classes4.dex */
public class cbdz implements cbro {
    private final gga a;
    private final dxio<caym> b;
    @dzsi
    private final ddho c;
    @dzsi
    private final ddho d;

    public cbdz(gga ggaVar, dxio<caym> dxioVar, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.d = ddhoVar;
        this.c = ddhoVar2;
    }

    @Override // defpackage.cbro, defpackage.aklb
    public cjtd a() {
        if (this.d != null) {
            cjta b = cjtd.b();
            b.d = this.d;
            return b.a();
        }
        return cjtd.b;
    }

    @Override // defpackage.cbro
    public CharSequence b() {
        return this.a.getText(R.string.UGC_EVENTS_ENTRYPOINT_TITLE);
    }

    @Override // defpackage.cbro
    public CharSequence c() {
        return this.a.getText(R.string.UGC_EVENTS_ENTRYPOINT_SUBTITLE);
    }

    @Override // defpackage.cbro
    public CharSequence d() {
        return this.a.getText(R.string.UGC_EVENTS_ENTRYPOINT_BUTTON);
    }

    @Override // defpackage.cbro
    public cqtd e() {
        return cqrt.f(2131232752);
    }

    @Override // defpackage.cbro
    public cqtd f() {
        return iup.e(R.raw.create_event);
    }

    @Override // defpackage.cbro
    public cjtd g() {
        if (this.c != null) {
            cjta b = cjtd.b();
            b.d = this.c;
            return b.a();
        }
        return cjtd.b;
    }

    @Override // defpackage.cbro
    public cqkl h() {
        this.b.a().a();
        return cqkl.a;
    }
}
