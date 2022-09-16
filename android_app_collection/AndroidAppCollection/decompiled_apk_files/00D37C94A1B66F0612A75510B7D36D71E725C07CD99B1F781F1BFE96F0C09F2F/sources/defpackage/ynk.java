package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ynk  reason: default package */
/* loaded from: classes4.dex */
public final class ynk {
    public final Class a;
    public final ynj b;
    public final int c;
    private final WeakReference d;
    private final int e;

    public ynk(Object obj, Class cls, Object obj2, ynj ynjVar) {
        this.d = new WeakReference(obj);
        cls.getClass();
        this.a = cls;
        this.b = ynjVar;
        this.e = Arrays.hashCode(new Object[]{obj, cls, obj2, ynjVar});
        this.c = obj2.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a() {
        return this.d.get();
    }

    public final boolean equals(Object obj) {
        ynj ynjVar;
        ynj ynjVar2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ynk) {
            ynk ynkVar = (ynk) obj;
            if (this.d.get() != ynkVar.d.get() || !this.a.equals(ynkVar.a) || this.c != ynkVar.c || (ynjVar = this.b) == (ynjVar2 = ynkVar.b) || !ynjVar.equals(ynjVar2)) {
                if (this.d.get() == ynkVar.d.get() && this.a.equals(ynkVar.a) && this.c == ynkVar.c && this.b == ynkVar.b) {
                    return true;
                }
            } else {
                Object obj2 = this.d.get();
                if ((this.b instanceof yno) && obj2 != null) {
                    String simpleName = obj2.getClass().getSimpleName();
                    String name = ((yno) this.b).a.getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 76 + String.valueOf(name).length());
                    sb.append("Potential duplicate subscribers at ");
                    sb.append(simpleName);
                    sb.append("#");
                    sb.append(name);
                    sb.append(", did you forget to unregister properly?");
                    Log.w("EventBus", sb.toString());
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }
}
