package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: vdw  reason: default package */
/* loaded from: classes4.dex */
public final class vdw {
    static final Pattern a;
    static final Pattern b;
    static final Pattern c;
    public static final Pattern d;
    private static final Logger g = Logger.getLogger(vdw.class.getName());
    private static final Map h;
    private static final Map i;
    private static final String j;
    private static final Pattern k;
    private static final Pattern l;
    private static final Pattern m;
    private static final String n;
    private static final String o;
    private static final Pattern p;
    private static final Pattern q;
    private static vdw r;
    public final Map e;
    private final vdu v;
    private final vec w = new vec();
    private final Set s = new HashSet(35);
    public final vef f = new vef();
    private final Set t = new HashSet(320);
    private final Set u = new HashSet();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        h = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        i = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            char charValue = ch.charValue();
            Character valueOf = Character.valueOf(Character.toLowerCase(charValue));
            Character valueOf2 = Character.valueOf(charValue);
            hashMap6.put(valueOf, valueOf2);
            hashMap6.put(valueOf2, valueOf2);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map = h;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb2 = sb.toString();
        j = sb2;
        a = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        k = Pattern.compile("(\\p{Nd})");
        l = Pattern.compile("[+＋\\p{Nd}]");
        b = Pattern.compile("[\\\\/] *x");
        c = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        m = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + sb2 + "\\p{Nd}]*";
        n = str;
        String u = u(true);
        o = u;
        u(false);
        p = Pattern.compile("(?:" + u + ")$", 66);
        q = Pattern.compile(str + "(?:" + u + ")?", 66);
        Pattern.compile("(\\D+)");
        d = Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        r = null;
    }

    public vdw(vdu vduVar, Map map) {
        this.v = vduVar;
        this.e = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.t.addAll(list);
            } else {
                this.u.add(entry.getKey());
            }
        }
        if (this.t.remove("001")) {
            g.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.s.addAll((Collection) map.get(1));
    }

    private final int A(CharSequence charSequence, vdy vdyVar, int i2) {
        vea p2 = p(vdyVar, i2);
        ArrayList arrayList = p2.b.isEmpty() ? vdyVar.a.b : p2.b;
        List list = p2.c;
        if (i2 == 3) {
            if (!w(p(vdyVar, 1))) {
                return A(charSequence, vdyVar, 2);
            }
            vea p3 = p(vdyVar, 2);
            if (w(p3)) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.addAll(p3.a() == 0 ? vdyVar.a.b : p3.b);
                Collections.sort(arrayList2);
                if (list.isEmpty()) {
                    list = p3.c;
                } else {
                    ArrayList arrayList3 = new ArrayList(list);
                    arrayList3.addAll(p3.c);
                    Collections.sort(arrayList3);
                    list = arrayList3;
                }
                arrayList = arrayList2;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        Integer valueOf = Integer.valueOf(length);
        if (list.contains(valueOf)) {
            return 2;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if (intValue == length) {
            return 1;
        }
        if (intValue > length) {
            return 4;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return 6;
        }
        return arrayList.subList(1, arrayList.size()).contains(valueOf) ? 1 : 5;
    }

    public static synchronized vdw b() {
        vdw vdwVar;
        synchronized (vdw.class) {
            if (r == null) {
                int i2 = vdt.a;
                k(new vdw(new vdu(), vtm.e()));
            }
            vdwVar = r;
        }
        return vdwVar;
    }

    public static String i(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int digit = Character.digit(charSequence.charAt(i2), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    static synchronized void k(vdw vdwVar) {
        synchronized (vdw.class) {
            r = vdwVar;
        }
    }

    static boolean n(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return q.matcher(charSequence).matches();
    }

    static final vea p(vdy vdyVar, int i2) {
        switch (i2 - 1) {
            case 0:
            case 2:
                return vdyVar.b;
            case 1:
                return vdyVar.c;
            case 3:
                return vdyVar.d;
            case 4:
                return vdyVar.e;
            case 5:
                return vdyVar.f;
            case 6:
                return vdyVar.h;
            case 7:
                return vdyVar.g;
            case 8:
                return vdyVar.i;
            case 9:
                return vdyVar.j;
            case 10:
                return vdyVar.k;
            default:
                return vdyVar.a;
        }
    }

    static void s(StringBuilder sb) {
        if (m.matcher(sb).matches()) {
            int length = sb.length();
            Map map = i;
            StringBuilder sb2 = new StringBuilder(sb.length());
            for (int i2 = 0; i2 < sb.length(); i2++) {
                Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(sb.charAt(i2))));
                if (ch != null) {
                    sb2.append(ch);
                }
            }
            sb.replace(0, length, sb2.toString());
            return;
        }
        sb.replace(0, sb.length(), i(sb));
    }

    private final int t(String str) {
        vdy c2 = c(str);
        if (c2 != null) {
            return c2.l;
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    private static String u(boolean z) {
        String str = (";ext=" + v(20)) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + v(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + v(9) + "#?") + "|" + ("[- ]+" + v(6) + "#");
        if (z) {
            return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + v(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + v(9) + "#?");
        }
        return str;
    }

    private static String v(int i2) {
        return "(\\p{Nd}{1," + i2 + "})";
    }

    private static boolean w(vea veaVar) {
        return (veaVar.a() == 1 && ((Integer) veaVar.b.get(0)).intValue() == -1) ? false : true;
    }

    private final boolean x(String str) {
        return str != null && this.t.contains(str);
    }

    private final int y(String str, vdy vdyVar) {
        if (l(str, vdyVar.a)) {
            if (l(str, vdyVar.e)) {
                return 5;
            }
            if (l(str, vdyVar.d)) {
                return 4;
            }
            if (l(str, vdyVar.f)) {
                return 6;
            }
            if (l(str, vdyVar.h)) {
                return 7;
            }
            if (l(str, vdyVar.g)) {
                return 8;
            }
            if (l(str, vdyVar.i)) {
                return 9;
            }
            if (l(str, vdyVar.j)) {
                return 10;
            }
            if (l(str, vdyVar.k)) {
                return 11;
            }
            return l(str, vdyVar.b) ? (vdyVar.r || l(str, vdyVar.c)) ? 3 : 1 : (vdyVar.r || !l(str, vdyVar.c)) ? 12 : 2;
        }
        return 12;
    }

    private final int z(CharSequence charSequence, vdy vdyVar) {
        return A(charSequence, vdyVar, 12);
    }

    public final int a(String str) {
        if (!x(str)) {
            Logger logger = g;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append(") provided.");
            logger.log(level, sb.toString());
            return 0;
        }
        return t(str);
    }

    final vdy c(String str) {
        if (!x(str)) {
            return null;
        }
        return vdt.a(str, this.v.a);
    }

    public final vdy d(int i2, String str) {
        if ("001".equals(str)) {
            Map map = this.e;
            Integer valueOf = Integer.valueOf(i2);
            if (!map.containsKey(valueOf)) {
                return null;
            }
            vdu vduVar = this.v;
            List list = (List) vtm.e().get(valueOf);
            if (list.size() == 1 && "001".equals(list.get(0))) {
                return vdt.a(valueOf, vduVar.b);
            }
            return null;
        }
        return c(str);
    }

    public final veb e(CharSequence charSequence, String str) {
        CharSequence charSequence2;
        int q2;
        veb vebVar = new veb();
        if (charSequence == null) {
            throw new vdv(2, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new vdv(5, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String charSequence3 = charSequence.toString();
        int indexOf = charSequence3.indexOf(";phone-context=");
        String str2 = "";
        if (indexOf < 0) {
            Matcher matcher = l.matcher(charSequence3);
            if (matcher.find()) {
                charSequence2 = charSequence3.subSequence(matcher.start(), charSequence3.length());
                Matcher matcher2 = c.matcher(charSequence2);
                if (matcher2.find()) {
                    charSequence2 = charSequence2.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = b.matcher(charSequence2);
                if (matcher3.find()) {
                    charSequence2 = charSequence2.subSequence(0, matcher3.start());
                }
            } else {
                charSequence2 = str2;
            }
            sb.append(charSequence2);
        } else {
            int i2 = indexOf + 15;
            if (i2 < charSequence3.length() - 1 && charSequence3.charAt(i2) == '+') {
                int indexOf2 = charSequence3.indexOf(59, i2);
                if (indexOf2 > 0) {
                    sb.append(charSequence3.substring(i2, indexOf2));
                } else {
                    sb.append(charSequence3.substring(i2));
                }
            }
            int indexOf3 = charSequence3.indexOf("tel:");
            sb.append(charSequence3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
        }
        int indexOf4 = sb.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb.delete(indexOf4, sb.length());
        }
        if (n(sb)) {
            if (x(str) || (sb.length() != 0 && a.matcher(sb).lookingAt())) {
                Matcher matcher4 = p.matcher(sb);
                if (matcher4.find() && n(sb.substring(0, matcher4.start()))) {
                    int groupCount = matcher4.groupCount();
                    int i3 = 1;
                    while (true) {
                        if (i3 > groupCount) {
                            break;
                        } else if (matcher4.group(i3) != null) {
                            str2 = matcher4.group(i3);
                            sb.delete(matcher4.start(), sb.length());
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (str2.length() > 0) {
                    str2.getClass();
                    vebVar.c = true;
                    vebVar.d = str2;
                }
                vdy c2 = c(str);
                StringBuilder sb2 = new StringBuilder();
                try {
                    q2 = q(sb, c2, sb2, vebVar);
                } catch (vdv e) {
                    Matcher matcher5 = a.matcher(sb);
                    if (e.a == 1 && matcher5.lookingAt()) {
                        q2 = q(sb.substring(matcher5.end()), c2, sb2, vebVar);
                        if (q2 == 0) {
                            throw new vdv(1, "Could not interpret numbers after plus-sign.");
                        }
                    } else {
                        throw new vdv(e.a, e.getMessage());
                    }
                }
                if (q2 != 0) {
                    String g2 = g(q2);
                    if (!g2.equals(str)) {
                        c2 = d(q2, g2);
                    }
                } else {
                    s(sb);
                    sb2.append((CharSequence) sb);
                    if (str != null) {
                        vebVar.a = c2.l;
                    }
                }
                if (sb2.length() < 2) {
                    throw new vdv(4, "The string supplied is too short to be a phone number.");
                }
                if (c2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    StringBuilder sb4 = new StringBuilder(sb2);
                    r(sb4, c2, sb3);
                    int z = z(sb4, c2);
                    if (z != 4 && z != 2 && z != 5) {
                        sb2 = sb4;
                    }
                }
                int length = sb2.length();
                if (length < 2) {
                    throw new vdv(4, "The string supplied is too short to be a phone number.");
                }
                if (length <= 17) {
                    if (sb2.length() > 1 && sb2.charAt(0) == '0') {
                        vebVar.e = true;
                        vebVar.f = true;
                        int i4 = 1;
                        while (i4 < sb2.length() - 1 && sb2.charAt(i4) == '0') {
                            i4++;
                        }
                        if (i4 != 1) {
                            vebVar.g = true;
                            vebVar.h = i4;
                        }
                    }
                    vebVar.b = Long.parseLong(sb2.toString());
                    return vebVar;
                }
                throw new vdv(5, "The string supplied is too long to be a phone number.");
            }
            throw new vdv(1, "Missing or invalid default region.");
        }
        throw new vdv(2, "The string supplied did not seem to be a phone number.");
    }

    public final String f(veb vebVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (vebVar.f && (i2 = vebVar.h) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(vebVar.b);
        return sb.toString();
    }

    public final String g(int i2) {
        List list = (List) this.e.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final String h(veb vebVar) {
        int i2 = vebVar.a;
        List<String> list = (List) this.e.get(Integer.valueOf(i2));
        if (list == null) {
            Logger logger = g;
            Level level = Level.INFO;
            logger.log(level, "Missing/invalid country_code (" + i2 + ")");
            return null;
        } else if (list.size() != 1) {
            String f = f(vebVar);
            for (String str : list) {
                vdy c2 = c(str);
                if (c2.u) {
                    if (this.f.a(c2.v).matcher(f).lookingAt()) {
                        return str;
                    }
                } else if (y(f, c2) != 12) {
                    return str;
                }
            }
            return null;
        } else {
            return (String) list.get(0);
        }
    }

    public final Set j() {
        return Collections.unmodifiableSet(this.t);
    }

    final boolean l(String str, vea veaVar) {
        int length = str.length();
        List list = veaVar.b;
        if (list.size() <= 0 || list.contains(Integer.valueOf(length))) {
            return this.w.a(str, veaVar);
        }
        return false;
    }

    public final boolean m(veb vebVar) {
        String h2 = h(vebVar);
        int i2 = vebVar.a;
        vdy d2 = d(i2, h2);
        if (d2 != null) {
            return ("001".equals(h2) || i2 == t(h2)) && y(f(vebVar), d2) != 12;
        }
        return false;
    }

    public final void o(int i2, int i3, StringBuilder sb) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            sb.insert(0, i2).insert(0, '+');
        } else if (i4 != 1) {
        } else {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        }
    }

    final int q(CharSequence charSequence, vdy vdyVar, StringBuilder sb, veb vebVar) {
        int i2 = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = vdyVar != null ? vdyVar.m : "NonMatch";
        if (sb2.length() != 0) {
            Matcher matcher = a.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                s(sb2);
            } else {
                Pattern a2 = this.f.a(str);
                s(sb2);
                Matcher matcher2 = a2.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = k.matcher(sb2.substring(end));
                    if (!matcher3.find() || !i(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                    }
                }
            }
            if (sb2.length() > 2) {
                if (sb2.length() != 0 && sb2.charAt(0) != '0') {
                    int length = sb2.length();
                    int i3 = 1;
                    while (true) {
                        if (i3 > 3 || i3 > length) {
                            break;
                        }
                        int parseInt = Integer.parseInt(sb2.substring(0, i3));
                        if (this.e.containsKey(Integer.valueOf(parseInt))) {
                            sb.append(sb2.substring(i3));
                            i2 = parseInt;
                            break;
                        }
                        i3++;
                    }
                }
                if (i2 != 0) {
                    vebVar.a = i2;
                    return i2;
                }
                throw new vdv(1, "Country calling code supplied was not recognised.");
            }
            throw new vdv(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        if (vdyVar != null) {
            int i4 = vdyVar.l;
            String valueOf = String.valueOf(i4);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                vea veaVar = vdyVar.a;
                r(sb4, vdyVar, null);
                if ((!this.w.a(sb2, veaVar) && this.w.a(sb4, veaVar)) || z(sb2, vdyVar) == 6) {
                    sb.append((CharSequence) sb4);
                    vebVar.a = i4;
                    return i4;
                }
            }
        }
        vebVar.a = 0;
        return 0;
    }

    final void r(StringBuilder sb, vdy vdyVar, StringBuilder sb2) {
        int length = sb.length();
        String str = vdyVar.p;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.f.a(str).matcher(sb);
        if (!matcher.lookingAt()) {
            return;
        }
        vea veaVar = vdyVar.a;
        boolean a2 = this.w.a(sb, veaVar);
        int groupCount = matcher.groupCount();
        String str2 = vdyVar.q;
        if (str2 == null || str2.length() == 0 || matcher.group(groupCount) == null) {
            if (a2 && !this.w.a(sb.substring(matcher.end()), veaVar)) {
                return;
            }
            if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                sb2.append(matcher.group(1));
            }
            sb.delete(0, matcher.end());
            return;
        }
        StringBuilder sb3 = new StringBuilder(sb);
        sb3.replace(0, length, matcher.replaceFirst(str2));
        if (a2 && !this.w.a(sb3.toString(), veaVar)) {
            return;
        }
        if (sb2 != null && groupCount > 1) {
            sb2.append(matcher.group(1));
        }
        sb.replace(0, sb.length(), sb3.toString());
    }
}
