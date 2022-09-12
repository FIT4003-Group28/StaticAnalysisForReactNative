package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bbts  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbts implements Serializable {
    public static bbtr k() {
        bbsj bbsjVar = new bbsj();
        bbuy bbuyVar = bbuy.SHOW_FULLY_EXPANDED_PLACESHEET;
        if (bbuyVar != null) {
            bbsjVar.a = bbuyVar;
            bbsjVar.c();
            bbsjVar.b = false;
            bbsjVar.c = false;
            bbsjVar.d = true;
            bbsjVar.e = true;
            bbsjVar.f = null;
            bbsjVar.g = null;
            bbsjVar.b(false);
            return bbsjVar;
        }
        throw new NullPointerException("Null afterUploadBehavior");
    }

    public abstract bbuy a();

    @dzsi
    public abstract bbvd b();

    public abstract Boolean c();

    public abstract Boolean d();

    public abstract Boolean e();

    public abstract Boolean f();

    @dzsi
    public abstract String g();

    public abstract boolean h();

    public abstract int i();

    @dzsi
    public abstract aojq j();
}
