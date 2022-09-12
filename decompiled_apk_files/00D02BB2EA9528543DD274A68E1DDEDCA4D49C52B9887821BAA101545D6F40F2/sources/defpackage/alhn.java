package defpackage;
/* compiled from: PG */
/* renamed from: alhn  reason: default package */
/* loaded from: classes.dex */
public class alhn implements akpo {
    public final akra a;
    public Object[] b;

    /* JADX INFO: Access modifiers changed from: protected */
    public alhn(akra akraVar) {
        this.a = akraVar;
    }

    @dzsi
    public final <T> T a(Class<T> cls) {
        Object[] objArr = this.b;
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object obj = objArr[0];
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }
}
