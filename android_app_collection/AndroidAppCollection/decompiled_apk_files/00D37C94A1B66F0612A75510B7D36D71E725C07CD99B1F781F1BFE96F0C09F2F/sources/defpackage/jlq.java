package defpackage;
/* compiled from: PG */
/* renamed from: jlq  reason: default package */
/* loaded from: classes3.dex */
public abstract class jlq implements jmf {
    private final Class a;
    private final Class b;

    /* JADX INFO: Access modifiers changed from: protected */
    public jlq(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    @Override // defpackage.jmf
    public final Class c() {
        return this.a;
    }

    @Override // defpackage.jmf
    public final Class d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Object e(amup amupVar, String str) {
        if (amupVar == null) {
            StringBuilder sb = new StringBuilder(str.length() + 37);
            sb.append("Args not specified, `");
            sb.append(str);
            sb.append("` not available.");
            throw new IllegalStateException(sb.toString());
        } else if (!amupVar.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(str.length() + 17);
            sb2.append("`");
            sb2.append(str);
            sb2.append("` not specified.");
            throw new IllegalStateException(sb2.toString());
        } else {
            Object obj = amupVar.get(str);
            obj.getClass();
            return obj;
        }
    }
}
