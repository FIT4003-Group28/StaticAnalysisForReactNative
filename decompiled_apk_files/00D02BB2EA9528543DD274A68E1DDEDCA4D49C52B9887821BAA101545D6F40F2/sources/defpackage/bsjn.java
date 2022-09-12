package defpackage;
/* compiled from: PG */
/* renamed from: bsjn  reason: default package */
/* loaded from: classes4.dex */
public abstract class bsjn {
    public static bsjn e(bsjm bsjmVar, ddho ddhoVar, cjqm cjqmVar) {
        return f(bsjmVar, ddhoVar, cjqmVar, false);
    }

    public static bsjn f(bsjm bsjmVar, ddho ddhoVar, cjqm cjqmVar, boolean z) {
        return new bsjh(bsjmVar, ddhoVar, cjqmVar, z);
    }

    public abstract bsjm a();

    public abstract ddho b();

    public abstract cjqm c();

    public abstract boolean d();
}
