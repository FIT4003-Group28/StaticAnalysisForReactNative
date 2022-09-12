package defpackage;
/* renamed from: cidc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class cidc {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends cide> boolean a(T t, @dzsi Object obj, cidd<T> ciddVar) {
        if (t == obj) {
            return true;
        }
        if (obj == null || !t.getClass().isAssignableFrom(obj.getClass())) {
            return false;
        }
        return ciddVar.a((cide) obj);
    }
}
