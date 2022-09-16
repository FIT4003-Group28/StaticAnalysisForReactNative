package defpackage;
/* compiled from: PG */
/* renamed from: aoqo  reason: default package */
/* loaded from: classes.dex */
public final class aoqo {
    public final aoqn a;

    private aoqo(aosj aosjVar, Object obj, aosj aosjVar2, Object obj2) {
        this.a = new aoqn(aosjVar, obj, aosjVar2, obj2);
    }

    public static int a(aoqn aoqnVar, Object obj, Object obj2) {
        return aoov.a(aoqnVar.a, 1, obj) + aoov.a(aoqnVar.c, 2, obj2);
    }

    public static aoqo b(aosj aosjVar, Object obj, aosj aosjVar2, Object obj2) {
        return new aoqo(aosjVar, obj, aosjVar2, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(aool aoolVar, aoqn aoqnVar, Object obj, Object obj2) {
        aoov.h(aoolVar, aoqnVar.a, 1, obj);
        aoov.h(aoolVar, aoqnVar.c, 2, obj2);
    }
}
