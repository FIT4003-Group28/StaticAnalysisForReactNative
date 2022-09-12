package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: ifk  reason: default package */
/* loaded from: classes.dex */
final class ifk extends iid {
    private final List<cqix<? extends igw>> a;
    private final cqix<?> b;
    private final iif c;
    private final igq d;
    private final ihz e;
    private final View.OnAttachStateChangeListener f;
    private final cjtd g;
    private final zc h;

    public ifk(List<cqix<? extends igw>> list, @dzsi cqix<?> cqixVar, @dzsi iif iifVar, @dzsi igq igqVar, @dzsi ihz ihzVar, @dzsi View.OnAttachStateChangeListener onAttachStateChangeListener, @dzsi cjtd cjtdVar, @dzsi zc zcVar) {
        this.a = list;
        this.b = cqixVar;
        this.c = iifVar;
        this.d = igqVar;
        this.e = ihzVar;
        this.f = onAttachStateChangeListener;
        this.g = cjtdVar;
        this.h = zcVar;
    }

    @Override // defpackage.iid, defpackage.iib
    public List<cqix<? extends igw>> a() {
        return this.a;
    }

    @Override // defpackage.iid, defpackage.iib
    @dzsi
    public cqix<?> b() {
        return this.b;
    }

    @Override // defpackage.iid, defpackage.iib
    @dzsi
    public iif c() {
        return this.c;
    }

    @Override // defpackage.iid, defpackage.iib
    @dzsi
    public igq d() {
        return this.d;
    }

    @Override // defpackage.iid, defpackage.iib
    @dzsi
    public ihz e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        cqix<?> cqixVar;
        iif iifVar;
        igq igqVar;
        ihz ihzVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        cjtd cjtdVar;
        zc zcVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iid) {
            iid iidVar = (iid) obj;
            if (this.a.equals(iidVar.a()) && ((cqixVar = this.b) != null ? cqixVar.equals(iidVar.b()) : iidVar.b() == null) && ((iifVar = this.c) != null ? iifVar.equals(iidVar.c()) : iidVar.c() == null) && ((igqVar = this.d) != null ? igqVar.equals(iidVar.d()) : iidVar.d() == null) && ((ihzVar = this.e) != null ? ihzVar.equals(iidVar.e()) : iidVar.e() == null) && iidVar.f() == null && ((onAttachStateChangeListener = this.f) != null ? onAttachStateChangeListener.equals(iidVar.g()) : iidVar.g() == null) && ((cjtdVar = this.g) != null ? cjtdVar.equals(iidVar.h()) : iidVar.h() == null) && ((zcVar = this.h) != null ? zcVar.equals(iidVar.i()) : iidVar.i() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.iid, defpackage.iib
    @dzsi
    public cqqw f() {
        return null;
    }

    @Override // defpackage.iid, defpackage.iib
    @dzsi
    public View.OnAttachStateChangeListener g() {
        return this.f;
    }

    @Override // defpackage.iid, defpackage.iib
    @dzsi
    public cjtd h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        cqix<?> cqixVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (cqixVar == null ? 0 : cqixVar.hashCode())) * 1000003;
        iif iifVar = this.c;
        int hashCode3 = (hashCode2 ^ (iifVar == null ? 0 : iifVar.hashCode())) * 1000003;
        igq igqVar = this.d;
        int hashCode4 = (hashCode3 ^ (igqVar == null ? 0 : igqVar.hashCode())) * 1000003;
        ihz ihzVar = this.e;
        int hashCode5 = (hashCode4 ^ (ihzVar == null ? 0 : ihzVar.hashCode())) * (-721379959);
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f;
        int hashCode6 = (hashCode5 ^ (onAttachStateChangeListener == null ? 0 : onAttachStateChangeListener.hashCode())) * 1000003;
        cjtd cjtdVar = this.g;
        int hashCode7 = (hashCode6 ^ (cjtdVar == null ? 0 : cjtdVar.hashCode())) * 1000003;
        zc zcVar = this.h;
        if (zcVar != null) {
            i = zcVar.hashCode();
        }
        return hashCode7 ^ i;
    }

    @Override // defpackage.iid, defpackage.iib
    @dzsi
    public zc i() {
        return this.h;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = "null".length();
        int length7 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 203 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("ModCarouselViewModelImpl{layoutItems=");
        sb.append(valueOf);
        sb.append(", endCard=");
        sb.append(valueOf2);
        sb.append(", viewProperties=");
        sb.append(valueOf3);
        sb.append(", modCarouselHeaderViewModel=");
        sb.append(valueOf4);
        sb.append(", moreButtonViewModel=");
        sb.append(valueOf5);
        sb.append(", onScrollListener=");
        sb.append("null");
        sb.append(", onAttachStateChangeListener=");
        sb.append(valueOf6);
        sb.append(", loggingParams=");
        sb.append(valueOf7);
        sb.append(", defaultItemAnimator=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
