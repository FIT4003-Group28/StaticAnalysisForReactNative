package ezvcard.parameter;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.util.GeoUri;
import ezvcard.util.g;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class VCardParameters extends g<String, String> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Set<VCardVersion>> f5567a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ALTID", EnumSet.of(VCardVersion.V4_0));
        hashMap.put("CALSCALE", EnumSet.of(VCardVersion.V4_0));
        hashMap.put("CHARSET", EnumSet.of(VCardVersion.V2_1));
        hashMap.put("GEO", EnumSet.of(VCardVersion.V4_0));
        hashMap.put("INDEX", EnumSet.of(VCardVersion.V4_0));
        hashMap.put("LEVEL", EnumSet.of(VCardVersion.V4_0));
        hashMap.put("MEDIATYPE", EnumSet.of(VCardVersion.V4_0));
        hashMap.put("PID", EnumSet.of(VCardVersion.V4_0));
        hashMap.put("SORT-AS", EnumSet.of(VCardVersion.V4_0));
        hashMap.put("TZ", EnumSet.of(VCardVersion.V4_0));
        f5567a = Collections.unmodifiableMap(hashMap);
    }

    public VCardParameters() {
    }

    public VCardParameters(VCardParameters vCardParameters) {
        super(vCardParameters);
    }

    public VCardParameters(Map<String, List<String>> map) {
        super(map);
    }

    public String a() {
        return c((VCardParameters) "ALTID");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(String str) {
        b("ALTID", str);
    }

    public Calscale b() {
        String c2 = c((VCardParameters) "CALSCALE");
        if (c2 == null) {
            return null;
        }
        return Calscale.b(c2);
    }

    public void a(Calscale calscale) {
        b("CALSCALE", calscale == null ? null : calscale.c());
    }

    public String c() {
        return c((VCardParameters) "CHARSET");
    }

    public ezvcard.parameter.a d() {
        String c2 = c((VCardParameters) "ENCODING");
        if (c2 == null) {
            return null;
        }
        return ezvcard.parameter.a.b(c2);
    }

    public GeoUri e() {
        String c2 = c((VCardParameters) "GEO");
        if (c2 == null) {
            return null;
        }
        try {
            return GeoUri.a(c2);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException(ezvcard.b.INSTANCE.c(15, "GEO"), e);
        }
    }

    public void a(GeoUri geoUri) {
        b("GEO", geoUri == null ? null : geoUri.toString());
    }

    public Integer f() {
        String c2 = c((VCardParameters) "INDEX");
        if (c2 == null) {
            return null;
        }
        try {
            return Integer.valueOf(c2);
        } catch (NumberFormatException e) {
            throw new IllegalStateException(ezvcard.b.INSTANCE.c(15, "INDEX"), e);
        }
    }

    public void a(Integer num) {
        b("INDEX", num == null ? null : num.toString());
    }

    public String g() {
        return c((VCardParameters) "LABEL");
    }

    public void b(String str) {
        b("LABEL", str);
    }

    public String h() {
        return c((VCardParameters) "LANGUAGE");
    }

    public void c(String str) {
        b("LANGUAGE", str);
    }

    public String i() {
        return c((VCardParameters) "LEVEL");
    }

    public void d(String str) {
        b("LEVEL", str);
    }

    public String j() {
        return c((VCardParameters) "MEDIATYPE");
    }

    public void e(String str) {
        b("MEDIATYPE", str);
    }

    public List<Pid> k() {
        return new c<Pid>("PID") { // from class: ezvcard.parameter.VCardParameters.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.c
            /* renamed from: a */
            public String _asString(Pid pid) {
                return pid.toString();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.c
            /* renamed from: a */
            public Pid mo221_asObject(String str) {
                return Pid.a(str);
            }

            @Override // ezvcard.parameter.VCardParameters.c
            protected IllegalStateException _exception(String str, Exception exc) {
                return new IllegalStateException(ezvcard.b.INSTANCE.c(15, "PID"), exc);
            }
        };
    }

    public Integer l() {
        String c2 = c((VCardParameters) "PREF");
        if (c2 == null) {
            return null;
        }
        try {
            return Integer.valueOf(c2);
        } catch (NumberFormatException e) {
            throw new IllegalStateException(ezvcard.b.INSTANCE.c(15, "PREF"), e);
        }
    }

    public void b(Integer num) {
        b("PREF", num == null ? null : num.toString());
    }

    public List<String> m() {
        return b((VCardParameters) "SORT-AS");
    }

    public void a(String... strArr) {
        d((VCardParameters) "SORT-AS");
        a((VCardParameters) "SORT-AS", (Collection) Arrays.asList(strArr));
    }

    public List<String> n() {
        return b((VCardParameters) "TYPE");
    }

    public String o() {
        return c((VCardParameters) "TYPE");
    }

    public void f(String str) {
        b("TYPE", str);
    }

    public String p() {
        return c((VCardParameters) "TZ");
    }

    public void g(String str) {
        b("TZ", str);
    }

    public VCardDataType q() {
        String c2 = c((VCardParameters) "VALUE");
        if (c2 == null) {
            return null;
        }
        return VCardDataType.b(c2);
    }

    public void a(VCardDataType vCardDataType) {
        b("VALUE", vCardDataType == null ? null : vCardDataType.a());
    }

    public List<ValidationWarning> a(VCardVersion vCardVersion) {
        ArrayList arrayList = new ArrayList(0);
        com.b.a.a.a syntaxStyle = vCardVersion.getSyntaxStyle();
        Iterator<Map.Entry<String, List<String>>> it = iterator();
        while (it.hasNext()) {
            Map.Entry<String, List<String>> next = it.next();
            String key = next.getKey();
            if (vCardVersion == VCardVersion.V4_0 || !"LABEL".equalsIgnoreCase(key)) {
                if (!com.b.a.a.c.b.a(key, syntaxStyle, true)) {
                    if (syntaxStyle == com.b.a.a.a.OLD) {
                        arrayList.add(new ValidationWarning(30, key, com.b.a.a.c.b.b(syntaxStyle, true).a().a(true)));
                    } else {
                        arrayList.add(new ValidationWarning(26, key));
                    }
                }
                Iterator<String> it2 = next.getValue().iterator();
                while (it2.hasNext()) {
                    String next2 = it2.next();
                    if ("LABEL".equalsIgnoreCase(key)) {
                        next2 = next2.replaceAll("\r\n|\r|\n", "");
                    }
                    if (!com.b.a.a.c.b.a(next2, syntaxStyle, false, true)) {
                        arrayList.add(new ValidationWarning(syntaxStyle == com.b.a.a.a.OLD ? 31 : 25, key, next2, com.b.a.a.c.b.a(syntaxStyle, false, true).a().a(true)));
                    }
                }
            }
        }
        String c2 = c((VCardParameters) "CALSCALE");
        if (c2 != null && Calscale.a(c2) == null) {
            arrayList.add(new ValidationWarning(3, "CALSCALE", c2, Calscale.a()));
        }
        String c3 = c((VCardParameters) "ENCODING");
        if (c3 != null) {
            ezvcard.parameter.a a2 = ezvcard.parameter.a.a(c3);
            if (a2 == null) {
                arrayList.add(new ValidationWarning(3, "ENCODING", c3, ezvcard.parameter.a.a()));
            } else if (!a2.a(vCardVersion)) {
                arrayList.add(new ValidationWarning(4, "ENCODING", c3));
            }
        }
        String c4 = c((VCardParameters) "VALUE");
        if (c4 != null) {
            VCardDataType a3 = VCardDataType.a(c4);
            if (a3 == null) {
                arrayList.add(new ValidationWarning(3, "VALUE", c4, VCardDataType.c()));
            } else if (!a3.a(vCardVersion)) {
                arrayList.add(new ValidationWarning(4, "VALUE", c4));
            }
        }
        try {
            e();
        } catch (IllegalStateException unused) {
            arrayList.add(new ValidationWarning(5, "GEO", c((VCardParameters) "GEO")));
        }
        try {
            Integer f = f();
            if (f != null && f.intValue() <= 0) {
                arrayList.add(new ValidationWarning(28, f));
            }
        } catch (IllegalStateException unused2) {
            arrayList.add(new ValidationWarning(5, "INDEX", c((VCardParameters) "INDEX")));
        }
        for (String str : b((VCardParameters) "PID")) {
            if (!i(str)) {
                arrayList.add(new ValidationWarning(27, str));
            }
        }
        try {
            Integer l = l();
            if (l != null && (l.intValue() < 1 || l.intValue() > 100)) {
                arrayList.add(new ValidationWarning(29, l));
            }
        } catch (IllegalStateException unused3) {
            arrayList.add(new ValidationWarning(5, "PREF", c((VCardParameters) "PREF")));
        }
        for (Map.Entry<String, Set<VCardVersion>> entry : f5567a.entrySet()) {
            String key2 = entry.getKey();
            if (c((VCardParameters) key2) != null && !entry.getValue().contains(vCardVersion)) {
                arrayList.add(new ValidationWarning(6, key2));
            }
        }
        String c5 = c();
        if (c5 != null) {
            try {
                Charset.forName(c5);
            } catch (IllegalCharsetNameException unused4) {
                arrayList.add(new ValidationWarning(22, c5));
            } catch (UnsupportedCharsetException unused5) {
                arrayList.add(new ValidationWarning(22, c5));
            }
        }
        return arrayList;
    }

    private static boolean i(String str) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.') {
                if (i == 0 || i == str.length() - 1 || z) {
                    return false;
                }
                z = true;
            } else if (charAt < '0' || charAt > '9') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.g
    /* renamed from: h */
    public String a(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    @Override // ezvcard.util.g
    public int hashCode() {
        Iterator<Map.Entry<String, List<String>>> it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Map.Entry<String, List<String>> next = it.next();
            String key = next.getKey();
            int i2 = 1;
            for (String str : next.getValue()) {
                i2 += str.toLowerCase().hashCode();
            }
            int hashCode = 31 + (key == null ? 0 : key.toLowerCase().hashCode()) + 1;
            i += hashCode + (hashCode * 31) + i2;
        }
        return i;
    }

    @Override // ezvcard.util.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VCardParameters vCardParameters = (VCardParameters) obj;
        if (s() != vCardParameters.s()) {
            return false;
        }
        Iterator<Map.Entry<String, List<String>>> it = iterator();
        while (it.hasNext()) {
            Map.Entry<String, List<String>> next = it.next();
            List<String> value = next.getValue();
            List<String> b2 = vCardParameters.b((VCardParameters) next.getKey());
            if (value.size() != b2.size()) {
                return false;
            }
            ArrayList arrayList = new ArrayList(value.size());
            for (String str : value) {
                arrayList.add(str.toLowerCase());
            }
            Collections.sort(arrayList);
            ArrayList arrayList2 = new ArrayList(b2.size());
            for (String str2 : b2) {
                arrayList2.add(str2.toLowerCase());
            }
            Collections.sort(arrayList2);
            if (!arrayList.equals(arrayList2)) {
                return false;
            }
        }
        return true;
    }

    /* loaded from: classes.dex */
    public abstract class b<T extends VCardParameter> extends a<T> {
        public b() {
            super("TYPE");
        }
    }

    /* loaded from: classes.dex */
    public abstract class a<T extends VCardParameter> extends c<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ezvcard.parameter.VCardParameters.c
        protected /* bridge */ /* synthetic */ String _asString(Object obj) {
            return _asString((a<T>) ((VCardParameter) obj));
        }

        public a(String str) {
            super(str);
        }

        protected String _asString(T t) {
            return t.c();
        }
    }

    /* loaded from: classes.dex */
    public abstract class c<T> extends AbstractList<T> {
        protected final String parameterName;
        protected final List<String> parameterValues;

        /* renamed from: _asObject */
        protected abstract T mo221_asObject(String str);

        protected abstract String _asString(T t);

        public c(String str) {
            this.parameterName = str;
            this.parameterValues = VCardParameters.this.b((VCardParameters) str);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, T t) {
            this.parameterValues.add(i, _asString(t));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return asObject(this.parameterValues.remove(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return asObject(this.parameterValues.get(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i, T t) {
            return asObject(this.parameterValues.set(i, _asString(t)));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parameterValues.size();
        }

        private T asObject(String str) {
            try {
                return mo221_asObject(str);
            } catch (Exception e) {
                throw _exception(str, e);
            }
        }

        protected IllegalStateException _exception(String str, Exception exc) {
            return new IllegalStateException(ezvcard.b.INSTANCE.c(26, this.parameterName), exc);
        }
    }
}
