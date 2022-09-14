package c.a.a.v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f2442a;

    /* renamed from: b  reason: collision with root package name */
    private f f2443b;

    private e(e eVar) {
        this.f2442a = new ArrayList(eVar.f2442a);
        this.f2443b = eVar.f2443b;
    }

    public e(String... strArr) {
        this.f2442a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f2442a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean b(String str) {
        return "__container".equals(str);
    }

    public e a(f fVar) {
        e eVar = new e(this);
        eVar.f2443b = fVar;
        return eVar;
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f2442a.add(str);
        return eVar;
    }

    public f a() {
        return this.f2443b;
    }

    public boolean a(String str, int i) {
        if (i >= this.f2442a.size()) {
            return false;
        }
        boolean z = i == this.f2442a.size() - 1;
        String str2 = this.f2442a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f2442a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f2442a.get(i + 1).equals(str)) {
            return i == this.f2442a.size() + (-2) || (i == this.f2442a.size() + (-3) && b());
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 >= this.f2442a.size() - 1) {
                return this.f2442a.get(i2).equals(str);
            }
            return false;
        }
    }

    public int b(String str, int i) {
        if (b(str)) {
            return 0;
        }
        if (!this.f2442a.get(i).equals("**")) {
            return 1;
        }
        return (i != this.f2442a.size() - 1 && this.f2442a.get(i + 1).equals(str)) ? 2 : 0;
    }

    public boolean c(String str, int i) {
        if (b(str)) {
            return true;
        }
        if (i >= this.f2442a.size()) {
            return false;
        }
        return this.f2442a.get(i).equals(str) || this.f2442a.get(i).equals("**") || this.f2442a.get(i).equals("*");
    }

    public boolean d(String str, int i) {
        return "__container".equals(str) || i < this.f2442a.size() - 1 || this.f2442a.get(i).equals("**");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f2442a);
        sb.append(",resolved=");
        sb.append(this.f2443b != null);
        sb.append('}');
        return sb.toString();
    }
}
