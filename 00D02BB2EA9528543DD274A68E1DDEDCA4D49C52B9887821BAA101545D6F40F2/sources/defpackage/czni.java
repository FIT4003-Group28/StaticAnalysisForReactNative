package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: czni  reason: default package */
/* loaded from: classes5.dex */
abstract class czni<DataT> {
    public final String b;
    public final cznf<?>[] c;
    private final cznk f;
    private boolean g = true;
    Map<czmw, czmx<DataT>> d = new HashMap(10);
    public int e = 0;
    public final Object a = new Object();

    public czni(String str, cznk cznkVar, cznf<?>... cznfVarArr) {
        this.b = str;
        this.c = cznfVarArr;
        this.f = cznkVar;
    }

    public abstract czmx<DataT> b();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(DataT datat, czmw czmwVar) {
        synchronized (this.a) {
            czmx<DataT> czmxVar = this.d.get(czmwVar);
            if (czmxVar == null) {
                czmxVar = b();
                this.d.put(czmwVar, czmxVar);
            }
            czmxVar.b(datat);
            this.e++;
        }
        cznj cznjVar = ((cznl) this.f).a;
        if (cznjVar != null) {
            cznjVar.a();
        }
    }

    public final void d() {
        this.g = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Object... objArr) {
        dbsk.a(this.c.length == objArr.length);
        if (this.g) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    if (!this.c[i].b.isInstance(obj)) {
                        String str = this.b;
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(obj.getClass());
                        cznf<?> cznfVar = this.c[i];
                        String str2 = cznfVar.a;
                        String valueOf3 = String.valueOf(cznfVar.b);
                        int length = str.length();
                        int length2 = String.valueOf(valueOf).length();
                        StringBuilder sb = new StringBuilder(length + 92 + length2 + String.valueOf(valueOf2).length() + str2.length() + String.valueOf(valueOf3).length());
                        sb.append("Streamz ");
                        sb.append(str);
                        sb.append(" has parameter {index: ");
                        sb.append(i);
                        sb.append(", value: ");
                        sb.append(valueOf);
                        sb.append(", type: ");
                        sb.append(valueOf2);
                        sb.append("}, but expected: {name: ");
                        sb.append(str2);
                        sb.append(", type: ");
                        sb.append(valueOf3);
                        sb.append("}");
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    String str3 = this.b;
                    String arrays = Arrays.toString(objArr);
                    StringBuilder sb2 = new StringBuilder(str3.length() + 29 + String.valueOf(arrays).length());
                    sb2.append("Streamz ");
                    sb2.append(str3);
                    sb2.append(" has null parameter: ");
                    sb2.append(arrays);
                    throw new NullPointerException(sb2.toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(cznf<?>... cznfVarArr) {
        if (Arrays.equals(this.c, cznfVarArr)) {
            return;
        }
        String str = this.b;
        String arrays = Arrays.toString(this.c);
        String arrays2 = Arrays.toString(cznfVarArr);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 32 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append("Streamz ");
        sb.append(str);
        sb.append(" with field diffs: ");
        sb.append(arrays);
        sb.append(" and ");
        sb.append(arrays2);
        throw new cznp(sb.toString());
    }
}
