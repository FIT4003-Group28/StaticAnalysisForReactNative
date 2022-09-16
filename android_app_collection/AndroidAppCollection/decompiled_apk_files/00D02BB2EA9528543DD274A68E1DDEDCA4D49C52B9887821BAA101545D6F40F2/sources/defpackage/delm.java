package defpackage;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: delm  reason: default package */
/* loaded from: classes6.dex */
public final class delm {
    private static final Set<String> a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    private static final List<String> b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final List<String> c = Arrays.asList("auto", "app", "am");
    private static final List<String> d = Arrays.asList("_r", "_dbg");
    private static final List<String> e;
    private static final List<String> f;

    static {
        String[][] strArr = {cosy.a, cosy.b};
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += strArr[i2].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i);
        int length = strArr[0].length;
        for (int i3 = 1; i3 < 2; i3++) {
            String[] strArr2 = strArr[i3];
            int length2 = strArr2.length;
            System.arraycopy(strArr2, 0, copyOf, length, length2);
            length += length2;
        }
        e = Arrays.asList((String[]) copyOf);
        f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean checkValidName(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean checkValidPublicName(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static String convertEventNameToLongForm(String str) {
        String a2 = cota.a(str, cosx.b, cosx.a);
        return a2 != null ? a2 : str;
    }

    public static String convertEventNameToShortForm(String str) {
        String a2 = cota.a(str, cosx.a, cosx.b);
        return a2 != null ? a2 : str;
    }

    public static Bundle fromConnectorUserProperty(delg delgVar) {
        Bundle bundle = new Bundle();
        String str = delgVar.a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = delgVar.b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = delgVar.c;
        if (obj != null) {
            if (obj instanceof Double) {
                bundle.putDouble("value", ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong("value", ((Long) obj).longValue());
            } else {
                bundle.putString("value", obj.toString());
            }
        }
        String str3 = delgVar.d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", delgVar.e);
        String str4 = delgVar.f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = delgVar.g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = delgVar.h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = delgVar.i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", delgVar.j);
        String str6 = delgVar.k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = delgVar.l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", delgVar.m);
        bundle.putBoolean("active", delgVar.n);
        bundle.putLong("triggered_timestamp", delgVar.o);
        return bundle;
    }

    public static boolean handleCampaignEventIfNeeded(String str, String str2, Bundle bundle) {
        char c2;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!isOriginAllowed(str) || bundle == null) {
            return false;
        }
        for (String str3 : d) {
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode == 101200) {
            if (str.equals("fcm")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 101230) {
            if (hashCode == 3142703 && str.equals("fiam")) {
                c2 = 2;
            }
            c2 = 65535;
        } else {
            if (str.equals("fdl")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        } else if (c2 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        } else if (c2 != 2) {
            return false;
        } else {
            bundle.putString("_cis", "fiam_integration");
            return true;
        }
    }

    public static boolean isConditionalUserPropertyValid(delg delgVar) {
        String str;
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        if (delgVar == null || (str = delgVar.a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = delgVar.c;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    } catch (Throwable th2) {
                        th = th2;
                        objectInputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                objectOutputStream = null;
            }
            try {
                Object readObject = objectInputStream.readObject();
                objectOutputStream.close();
                objectInputStream.close();
                obj2 = readObject;
                if (obj2 == null) {
                    return false;
                }
            } catch (Throwable th4) {
                th = th4;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                throw th;
            }
        }
        if (!isOriginAllowed(str) || !isUserPropertyNameAllowed(str, delgVar.b)) {
            return false;
        }
        String str2 = delgVar.k;
        if (str2 != null && (!isEventAllowedForLogging(str2, delgVar.l) || !handleCampaignEventIfNeeded(str, delgVar.k, delgVar.l))) {
            return false;
        }
        String str3 = delgVar.h;
        if (str3 != null && (!isEventAllowedForLogging(str3, delgVar.i) || !handleCampaignEventIfNeeded(str, delgVar.h, delgVar.i))) {
            return false;
        }
        String str4 = delgVar.f;
        if (str4 == null) {
            return true;
        }
        return isEventAllowedForLogging(str4, delgVar.g) && handleCampaignEventIfNeeded(str, delgVar.f, delgVar.g);
    }

    public static boolean isEventAllowedForLogging(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String str2 : d) {
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEventAllowedForNotifying(String str) {
        return !a.contains(str);
    }

    public static boolean isOriginAllowed(String str) {
        return !c.contains(str);
    }

    public static boolean isUserPropertyNameAllowed(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        } else if (e.contains(str2)) {
            return false;
        } else {
            for (String str3 : f) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static delg toConnectorUserProperty(Bundle bundle) {
        cnwc.a(bundle);
        delg delgVar = new delg();
        delgVar.a = (String) cosw.a(bundle, "origin", String.class, null);
        delgVar.b = (String) cosw.a(bundle, "name", String.class, null);
        delgVar.c = cosw.a(bundle, "value", Object.class, null);
        delgVar.d = (String) cosw.a(bundle, "trigger_event_name", String.class, null);
        delgVar.e = ((Long) cosw.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        delgVar.f = (String) cosw.a(bundle, "timed_out_event_name", String.class, null);
        delgVar.g = (Bundle) cosw.a(bundle, "timed_out_event_params", Bundle.class, null);
        delgVar.h = (String) cosw.a(bundle, "triggered_event_name", String.class, null);
        delgVar.i = (Bundle) cosw.a(bundle, "triggered_event_params", Bundle.class, null);
        delgVar.j = ((Long) cosw.a(bundle, "time_to_live", Long.class, 0L)).longValue();
        delgVar.k = (String) cosw.a(bundle, "expired_event_name", String.class, null);
        delgVar.l = (Bundle) cosw.a(bundle, "expired_event_params", Bundle.class, null);
        delgVar.n = ((Boolean) cosw.a(bundle, "active", Boolean.class, false)).booleanValue();
        delgVar.m = ((Long) cosw.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        delgVar.o = ((Long) cosw.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return delgVar;
    }

    public static void updateEventParamsIfNeeded(String str, String str2, Bundle bundle) {
        if (!"clx".equals(str) || !"_ae".equals(str2)) {
            return;
        }
        bundle.putLong("_r", 1L);
    }
}
