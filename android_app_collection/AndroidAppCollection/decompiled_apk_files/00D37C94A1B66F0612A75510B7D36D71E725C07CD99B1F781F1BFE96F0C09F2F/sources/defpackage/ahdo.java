package defpackage;

import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahdo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahdo implements Comparator {
    private final /* synthetic */ int f;
    public static final /* synthetic */ ahdo e = new ahdo(7);
    public static final /* synthetic */ ahdo d = new ahdo(6);
    public static final /* synthetic */ ahdo c = new ahdo(2);
    public static final /* synthetic */ ahdo b = new ahdo(1);
    public static final /* synthetic */ ahdo a = new ahdo();

    private /* synthetic */ ahdo() {
    }

    public /* synthetic */ ahdo(int i) {
        this.f = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                return -ahdq.b(ahdp.a((attl) obj, 0), ahdp.a((attl) obj2, 0));
            case 1:
                return ahdq.b(ahdp.a((attl) obj, 0), ahdp.a((attl) obj2, 0));
            case 2:
                avhm avhmVar = (avhm) obj;
                avhm avhmVar2 = (avhm) obj2;
                int i = avhmVar2.d * avhmVar2.e;
                int i2 = avhmVar.d * avhmVar.e;
                if (i == i2) {
                    return 0;
                }
                return i >= i2 ? 1 : -1;
            case 3:
                return agsf.a((alcw) ((Map.Entry) obj).getValue(), (alcw) ((Map.Entry) obj2).getValue());
            case 4:
                andc a2 = andc.a(obj);
                andc a3 = andc.a(obj2);
                if (a2 == a3) {
                    int ordinal = a2.ordinal();
                    if (ordinal == 0) {
                        return ((Boolean) obj).compareTo((Boolean) obj2);
                    }
                    if (ordinal == 1) {
                        return ((String) obj).compareTo((String) obj2);
                    }
                    if (ordinal == 2) {
                        return ((Long) obj).compareTo((Long) obj2);
                    }
                    if (ordinal == 3) {
                        return ((Double) obj).compareTo((Double) obj2);
                    }
                    throw null;
                }
                return a2.compareTo(a3);
            case 5:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 6:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str == null) {
                    return str2 == null ? 0 : -1;
                } else if (str2 != null) {
                    return str.compareTo(str2);
                } else {
                    return 1;
                }
            case 7:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            default:
                Integer valueOf = Integer.valueOf(((Constructor) obj2).getParameterTypes().length);
                Integer valueOf2 = Integer.valueOf(((Constructor) obj).getParameterTypes().length);
                if (valueOf != valueOf2) {
                    return valueOf.compareTo(valueOf2);
                }
                return 0;
        }
    }
}
