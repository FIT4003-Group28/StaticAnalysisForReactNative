package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: bvjj  reason: default package */
/* loaded from: classes.dex */
public class bvjj {
    public static final String a = "settings_preference";
    public static final String b;
    public static final AtomicBoolean c;
    @dzsi
    private static Pattern h;
    public final SharedPreferences d;
    protected volatile bwsa e;
    protected final crzl<String> f = new crzl<>();
    public final SharedPreferences.OnSharedPreferenceChangeListener g = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: bvjc
        private final bvjj a;

        {
            this.a = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            bvjj bvjjVar = this.a;
            if (bvjj.c.get() && str != null) {
                bvjjVar.f.b(str);
            }
        }
    };
    private final Context i;
    private bvjm j;

    public bvjj(Context context) {
        this.d = context.getSharedPreferences(a, 0);
        this.i = context;
    }

    public static String a(String str, @dzsi String str2) {
        if (!str.endsWith("#")) {
            str = String.valueOf(str).concat("#");
        }
        String valueOf = String.valueOf(str);
        String e = dbsj.e(str2);
        return e.length() != 0 ? valueOf.concat(e) : new String(valueOf);
    }

    private final void aA(String str, @dzsi btlu btluVar, byte[] bArr) {
        ab(str, btluVar, bArr == null ? null : Base64.encodeToString(bArr, 0));
    }

    private static void aB(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        Set<String> keySet = sharedPreferences.getAll().keySet();
        Map<String, ?> all = sharedPreferences.getAll();
        for (String str : keySet) {
            if (str != null) {
                Object obj = all.get(str);
                if (obj instanceof Boolean) {
                    editor.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Float) {
                    editor.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Integer) {
                    editor.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    editor.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof String) {
                    editor.putString(str, (String) obj);
                } else if (obj instanceof Set) {
                    editor.putStringSet(str, sharedPreferences.getStringSet(str, new HashSet()));
                }
            }
        }
        editor.commit();
    }

    private final byte[] aC(String str, @dzsi btlu btluVar) {
        String y = y(str, btluVar, null);
        if (y != null) {
            try {
                return Base64.decode(y, 0);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @dzsi
    public static dcep<String> ak(@dzsi EnumSet<?> enumSet) {
        if (enumSet == null) {
            return null;
        }
        dcen N = dcep.N();
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            N.b(((Enum) it.next()).name());
        }
        return N.f();
    }

    public static void ar(final Context context, Executor executor) {
        Runnable runnable = new Runnable(context) { // from class: bvjb
            private final Context a;

            {
                this.a = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = this.a;
                String str = bvjj.a;
                SharedPreferences sharedPreferences = context2.getSharedPreferences("_has_set_default_values", 0);
                if (!sharedPreferences.getBoolean("_has_set_default_values", false)) {
                    avb avbVar = new avb(context2);
                    avbVar.d(str);
                    avbVar.a = null;
                    avbVar.a(context2, R.xml.settings, null);
                    sharedPreferences.edit().putBoolean("_has_set_default_values", true).apply();
                }
            }
        };
        if (!context.getSharedPreferences("_has_set_default_values", 0).getBoolean("_has_set_default_values", false)) {
            runnable.run();
        } else {
            executor.execute(runnable);
        }
    }

    private final <V> crzm<dbsg<V>> aw(bvjk bvjkVar, @dzsi btlu btluVar, dbty<V> dbtyVar) {
        return ax(bvjkVar, av(bvjkVar.kz, btluVar), dbtyVar);
    }

    private final <V> crzm<dbsg<V>> ax(bvjk bvjkVar, String str, dbty<V> dbtyVar) {
        if (bvjkVar.a()) {
            return (crzm<V>) this.f.a(str, new bvjh(this, str, dbtyVar));
        }
        return (crzm<V>) this.f.a(str, new bvji());
    }

    private static <T extends Enum<T>> T ay(Class<T> cls, @dzsi String str, T t) {
        if (dbsj.d(str)) {
            return t;
        }
        try {
            return (T) Enum.valueOf(cls, str);
        } catch (ClassCastException | IllegalArgumentException unused) {
            return t;
        }
    }

    private final void az(String str, @dzsi btlu btluVar, @dzsi dssj dssjVar) {
        aA(str, btluVar, dssjVar == null ? null : dssjVar.bS());
    }

    public static String b(String str, @dzsi String str2) {
        dbsk.a(!btlu.e(str2));
        String e = dbsj.e(str2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + e.length());
        sb.append(str);
        sb.append("$");
        sb.append(e);
        return sb.toString();
    }

    public static btlu c(@dzsi btlu btluVar) {
        return btluVar != null ? btluVar : btlu.b;
    }

    public static String d(String str) {
        if (h == null) {
            h = Pattern.compile("^([^#$]+)([#$])(.*)$");
        }
        Matcher matcher = h.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        String group = matcher.group(1);
        dbsk.s(group);
        return group;
    }

    public final String A(bvjk bvjkVar, @dzsi btlu btluVar, String str) {
        return y(bvjkVar.kz, c(btluVar), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<String> B(String str, @dzsi btlu btluVar, Set<String> set) {
        if (bvjk.b(str)) {
            try {
                HashSet hashSet = new HashSet();
                Set<String> stringSet = this.d.getStringSet(av(str, btluVar), hashSet);
                if (stringSet != hashSet) {
                    return stringSet;
                }
            } catch (ClassCastException unused) {
            }
        }
        return set;
    }

    public final Set<String> C(bvjk bvjkVar, Set<String> set) {
        return B(bvjkVar.kz, null, set);
    }

    public final crzm<dbsg<Set<String>>> D(final bvjk bvjkVar) {
        return k(bvjkVar, new dbty(this, bvjkVar) { // from class: bviy
            private final bvjj a;
            private final bvjk b;

            {
                this.a = this;
                this.b = bvjkVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.B(this.b.kz, null, null);
            }
        });
    }

    public final Set<String> E(bvjk bvjkVar, @dzsi btlu btluVar, Set<String> set) {
        return B(bvjkVar.kz, c(btluVar), set);
    }

    public final List<String> F(bvjk bvjkVar, List<String> list) {
        try {
            String str = null;
            if (bvjkVar.a()) {
                str = this.d.getString(bvjkVar.kz, null);
            }
            if (str == null) {
                return list;
            }
            ArrayList a2 = dchl.a();
            for (String str2 : dbtm.a(',').g(str)) {
                a2.add(new String(Base64.decode(str2, 0), dbrc.c));
            }
            if (!a2.isEmpty()) {
                a2.remove(a2.size() - 1);
            }
            return a2;
        } catch (ClassCastException | IllegalArgumentException unused) {
            return list;
        }
    }

    public final crzm<dbsg<List<String>>> G(final bvjk bvjkVar) {
        return k(bvjkVar, new dbty(this, bvjkVar) { // from class: bviz
            private final bvjj a;
            private final bvjk b;

            {
                this.a = this;
                this.b = bvjkVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.F(this.b, dcdc.e());
            }
        });
    }

    public final <T extends Enum<T>> T H(bvjk bvjkVar, Class<T> cls, T t) {
        return bvjkVar.a() ? (T) ay(cls, z(bvjkVar, null), t) : t;
    }

    public final <T extends Enum<T>> EnumSet<T> I(bvjk bvjkVar, Class<T> cls) {
        return J(C(bvjkVar, null), cls);
    }

    public final <T extends Enum<T>> EnumSet<T> J(@dzsi Set<String> set, Class<T> cls) {
        EnumSet<T> noneOf = EnumSet.noneOf(cls);
        if (set != null) {
            for (String str : set) {
                Enum ay = ay(cls, str, null);
                if (ay != null) {
                    noneOf.add(ay);
                }
            }
        }
        return noneOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends dssj> T K(String str, @dzsi btlu btluVar, dssr<T> dssrVar, T t) {
        T t2;
        return (!bvjk.b(str) || (t2 = (T) bvrs.b(aC(str, btluVar), dssrVar)) == null) ? t : t2;
    }

    public final <T extends dssj> T L(bvjk bvjkVar, dssr<T> dssrVar, T t) {
        return (T) K(bvjkVar.kz, null, dssrVar, t);
    }

    public final <T extends dssj> crzm<dbsg<T>> M(final bvjk bvjkVar, final dssr<T> dssrVar) {
        return k(bvjkVar, new dbty(this, bvjkVar, dssrVar) { // from class: bvja
            private final bvjj a;
            private final bvjk b;
            private final dssr c;

            {
                this.a = this;
                this.b = bvjkVar;
                this.c = dssrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bvjj bvjjVar = this.a;
                bvjk bvjkVar2 = this.b;
                return bvjjVar.K(bvjkVar2.kz, null, this.c, null);
            }
        });
    }

    public final <T extends dssj> T N(bvjk bvjkVar, @dzsi btlu btluVar, dssr<T> dssrVar, T t) {
        return (T) K(bvjkVar.kz, c(btluVar), dssrVar, t);
    }

    final void O(String str, @dzsi btlu btluVar) {
        if (bvjk.b(str)) {
            this.d.edit().remove(av(str, btluVar)).apply();
        }
    }

    public final void P(bvjk bvjkVar) {
        O(bvjkVar.kz, null);
    }

    public final void Q(bvjk bvjkVar, @dzsi btlu btluVar) {
        O(bvjkVar.kz, c(btluVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(String str, @dzsi btlu btluVar, boolean z) {
        if (bvjk.b(str)) {
            this.d.edit().putBoolean(av(str, btluVar), z).apply();
        }
    }

    public final void S(bvjk bvjkVar, boolean z) {
        R(bvjkVar.kz, null, z);
    }

    public final void T(bvjk bvjkVar, @dzsi btlu btluVar, boolean z) {
        R(bvjkVar.kz, c(btluVar), z);
    }

    public final void U(String str, @dzsi btlu btluVar, float f) {
        if (bvjk.b(str)) {
            this.d.edit().putFloat(av(str, btluVar), f).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(String str, @dzsi btlu btluVar, int i) {
        if (bvjk.b(str)) {
            this.d.edit().putInt(av(str, btluVar), i).apply();
        }
    }

    public final void W(bvjk bvjkVar, int i) {
        V(bvjkVar.kz, null, i);
    }

    public final void X(bvjk bvjkVar, @dzsi btlu btluVar, int i) {
        V(bvjkVar.kz, c(btluVar), i);
    }

    final void Y(String str, @dzsi btlu btluVar, long j) {
        if (bvjk.b(str)) {
            this.d.edit().putLong(av(str, btluVar), j).apply();
        }
    }

    public final void Z(bvjk bvjkVar, long j) {
        Y(bvjkVar.kz, null, j);
    }

    public final void aa(bvjk bvjkVar, @dzsi btlu btluVar, long j) {
        Y(bvjkVar.kz, c(btluVar), j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ab(String str, @dzsi btlu btluVar, @dzsi String str2) {
        if (bvjk.b(str)) {
            this.d.edit().putString(av(str, btluVar), str2).apply();
        }
    }

    public final void ac(bvjk bvjkVar, @dzsi String str) {
        ab(bvjkVar.kz, null, str);
    }

    public final void ad(bvjk bvjkVar, @dzsi btlu btluVar, @dzsi String str) {
        ab(bvjkVar.kz, c(btluVar), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ae(String str, @dzsi btlu btluVar, @dzsi Set<String> set) {
        if (bvjk.b(str)) {
            this.d.edit().putStringSet(av(str, btluVar), set).apply();
        }
    }

    public final void af(bvjk bvjkVar, @dzsi Set<String> set) {
        ae(bvjkVar.kz, null, set);
    }

    public final void ag(bvjk bvjkVar, @dzsi btlu btluVar, @dzsi Set<String> set) {
        ae(bvjkVar.kz, c(btluVar), set);
    }

    public final void ah(bvjk bvjkVar, @dzsi List<String> list) {
        String str;
        if (bvjkVar.a()) {
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                for (String str2 : list) {
                    sb.append(Base64.encodeToString(str2.getBytes(dbrc.c), 0));
                    sb.append(',');
                }
                str = sb.toString();
            } else {
                str = null;
            }
            this.d.edit().putString(bvjkVar.kz, str).apply();
        }
    }

    public final void ai(bvjk bvjkVar, @dzsi Enum<?> r2) {
        ac(bvjkVar, r2 == null ? null : r2.name());
    }

    public final void aj(bvjk bvjkVar, @dzsi EnumSet<?> enumSet) {
        af(bvjkVar, ak(enumSet));
    }

    public final void al(bvjk bvjkVar, @dzsi dssj dssjVar) {
        az(bvjkVar.kz, null, dssjVar);
    }

    public final void am(bvjk bvjkVar, @dzsi btlu btluVar, @dzsi dssj dssjVar) {
        az(bvjkVar.kz, c(btluVar), dssjVar);
    }

    public final void an(bvjk bvjkVar, @dzsi btlu btluVar, @dzsi dspd dspdVar) {
        aA(bvjkVar.kz, c(btluVar), dspdVar == null ? null : dspdVar.G());
    }

    public final void ao(bvjk bvjkVar) {
        W(bvjkVar, s(bvjkVar, 0) + 1);
    }

    public final void ap(bvjk bvjkVar, @dzsi btlu btluVar) {
        X(bvjkVar, btluVar, t(bvjkVar, btluVar, 0) + 1);
    }

    public final boolean aq() {
        return this.d.edit().commit();
    }

    public final boolean as() {
        SharedPreferences.Editor edit = this.i.getSharedPreferences(b, 0).edit();
        aB(this.d, edit);
        edit.commit();
        ArrayList<bvjk> b2 = dchl.b(bvjk.dX, bvjk.dZ, bvjk.gF, bvjk.he, bvjk.iW, bvjk.jH, bvjk.jI, bvjk.bt, bvjk.bq);
        ArrayList arrayList = new ArrayList();
        for (bvjk bvjkVar : b2) {
            if (!bvjk.f.equals(bvjkVar)) {
                arrayList.add(bvjkVar.kz);
            }
        }
        SharedPreferences.Editor edit2 = this.d.edit();
        for (String str : this.d.getAll().keySet()) {
            if (arrayList.contains(str)) {
                edit2.remove(str);
            }
        }
        return edit2.commit();
    }

    public final boolean at() {
        SharedPreferences sharedPreferences = this.i.getSharedPreferences(b, 0);
        AtomicBoolean atomicBoolean = c;
        atomicBoolean.compareAndSet(true, false);
        try {
            SharedPreferences.Editor edit = this.d.edit();
            edit.clear();
            aB(sharedPreferences, edit);
            boolean commit = edit.commit();
            atomicBoolean.compareAndSet(false, true);
            return commit;
        } catch (Throwable th) {
            c.compareAndSet(false, true);
            throw th;
        }
    }

    public final dspd au(bvjk bvjkVar, @dzsi btlu btluVar) {
        byte[] aC = aC(bvjkVar.kz, c(btluVar));
        if (aC == null) {
            return null;
        }
        return dspd.x(aC);
    }

    @Deprecated
    public final bwsa e() {
        bwsa bwrwVar;
        if (this.e == null) {
            if (this.d.getBoolean(bvjk.m.toString(), false)) {
                bwrwVar = new bwry();
            } else {
                bwrwVar = new bwrw(this.i);
            }
            this.e = bwrwVar;
        }
        return this.e;
    }

    @Deprecated
    public final void f(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.d.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Deprecated
    public final void g(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.d.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final synchronized auf h() {
        if (this.j == null) {
            this.j = new bvjm(this);
        }
        return this.j;
    }

    public final boolean i(bvjk bvjkVar) {
        return bvjkVar.a() && this.d.contains(bvjkVar.kz);
    }

    public final boolean j(bvjk bvjkVar, @dzsi btlu btluVar) {
        return bvjkVar.a() && this.d.contains(av(bvjkVar.kz, c(btluVar)));
    }

    public final <V> crzm<dbsg<V>> k(bvjk bvjkVar, dbty<V> dbtyVar) {
        return ax(bvjkVar, bvjkVar.kz, dbtyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l(String str, @dzsi btlu btluVar, boolean z) {
        try {
            return bvjk.b(str) ? this.d.getBoolean(av(str, btluVar), z) : z;
        } catch (ClassCastException unused) {
            return z;
        }
    }

    public final boolean m(bvjk bvjkVar, boolean z) {
        return l(bvjkVar.kz, null, z);
    }

    public final crzm<dbsg<Boolean>> n(final bvjk bvjkVar) {
        return k(bvjkVar, new dbty(this, bvjkVar) { // from class: bvjd
            private final bvjj a;
            private final bvjk b;

            {
                this.a = this;
                this.b = bvjkVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.m(this.b, false));
            }
        });
    }

    public final boolean o(bvjk bvjkVar, @dzsi btlu btluVar, boolean z) {
        return l(bvjkVar.kz, c(btluVar), z);
    }

    public final crzm<dbsg<Boolean>> p(final bvjk bvjkVar, @dzsi final btlu btluVar) {
        return aw(bvjkVar, c(btluVar), new dbty(this, bvjkVar, btluVar) { // from class: bvje
            private final bvjj a;
            private final bvjk b;
            private final btlu c;

            {
                this.a = this;
                this.b = bvjkVar;
                this.c = btluVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.o(this.b, bvjj.c(this.c), false));
            }
        });
    }

    public final float q(String str, @dzsi btlu btluVar, float f) {
        if (bvjk.b(str)) {
            try {
                return this.d.getFloat(av(str, btluVar), f);
            } catch (ClassCastException unused) {
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int r(String str, @dzsi btlu btluVar, int i) {
        if (bvjk.b(str)) {
            try {
                return this.d.getInt(av(str, btluVar), i);
            } catch (ClassCastException unused) {
            }
        }
        return i;
    }

    public final int s(bvjk bvjkVar, int i) {
        return r(bvjkVar.kz, null, i);
    }

    public final int t(bvjk bvjkVar, @dzsi btlu btluVar, int i) {
        return r(bvjkVar.kz, c(btluVar), i);
    }

    public final crzm<dbsg<Integer>> u(final bvjk bvjkVar, @dzsi final btlu btluVar) {
        return aw(bvjkVar, c(btluVar), new dbty(this, bvjkVar, btluVar) { // from class: bvjf
            private final bvjj a;
            private final bvjk b;
            private final btlu c;

            {
                this.a = this;
                this.b = bvjkVar;
                this.c = btluVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Integer.valueOf(this.a.t(this.b, bvjj.c(this.c), 0));
            }
        });
    }

    protected final long v(String str, @dzsi btlu btluVar, long j) {
        if (bvjk.b(str)) {
            try {
                return this.d.getLong(av(str, btluVar), j);
            } catch (ClassCastException unused) {
            }
        }
        return j;
    }

    public final long w(bvjk bvjkVar, long j) {
        return v(bvjkVar.kz, null, j);
    }

    public final long x(bvjk bvjkVar, @dzsi btlu btluVar, long j) {
        return v(bvjkVar.kz, c(btluVar), j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String y(String str, @dzsi btlu btluVar, String str2) {
        if (bvjk.b(str)) {
            try {
                String str3 = new String();
                String string = this.d.getString(av(str, btluVar), str3);
                if (string != str3) {
                    return string;
                }
            } catch (ClassCastException unused) {
            }
        }
        return str2;
    }

    public final String z(bvjk bvjkVar, String str) {
        return y(bvjkVar.kz, null, str);
    }

    static {
        String valueOf = String.valueOf(a);
        b = valueOf.length() != 0 ? "in0-".concat(valueOf) : new String("in0-");
        c = new AtomicBoolean(true);
    }

    private static String av(String str, @dzsi btlu btluVar) {
        if (btluVar == null) {
            return str;
        }
        if (btluVar.f() || str.endsWith("#")) {
            return a(str, btluVar.t());
        }
        return b(str, btlu.h(btluVar));
    }
}
