package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: bonl  reason: default package */
/* loaded from: classes3.dex */
public class bonl implements bopx {
    @dzsi
    private LinkedHashMap<byea, String> b;
    private final Context c;
    private boolean e;
    private List<byea> a = dchl.a();
    private List<String> d = dchl.a();

    public bonl(Context context, byea byeaVar) {
        this.c = context;
        this.a.add(byeaVar);
    }

    public void a(String str) {
        this.d.add(str);
    }

    @Override // defpackage.bopx
    public String b(boolean z) {
        String g = new bydk(this.c).g(EnumSet.copyOf((Collection) this.a), this.b, false, false, 0);
        return z ? this.c.getString(R.string.BUSINESS_HOURS_DAYS_WITH_SEPARATOR, g) : g;
    }

    public List<String> c() {
        return this.d;
    }

    public void d(byea byeaVar) {
        this.a.add(byeaVar);
    }

    public List<byea> e() {
        return this.a;
    }

    public void f(LinkedHashMap<byea, String> linkedHashMap) {
        this.b = linkedHashMap;
    }

    @dzsi
    public LinkedHashMap<byea, String> g() {
        return this.b;
    }

    public void h(boolean z) {
        this.e = z;
    }

    public boolean i() {
        return this.e;
    }

    @Override // defpackage.bopx
    public List<bopz> j() {
        ArrayList a = dchl.a();
        int size = this.d.size();
        int i = 0;
        while (i < size) {
            String valueOf = String.valueOf(this.d.get(i));
            String valueOf2 = String.valueOf(i == size + (-1) ? "" : this.c.getString(R.string.BUSINESS_HOURS_TIMESPAN_SEPARATOR));
            a.add(new bonp(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Boolean.valueOf(this.e)));
            i++;
        }
        return a;
    }
}
