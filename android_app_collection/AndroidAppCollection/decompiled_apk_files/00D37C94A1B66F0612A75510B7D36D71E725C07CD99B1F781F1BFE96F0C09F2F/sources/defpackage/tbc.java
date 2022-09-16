package defpackage;

import android.content.Context;
import android.provider.Settings;
import com.google.android.libraries.elements.interfaces.DebuggerCallback;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
/* compiled from: PG */
/* renamed from: tbc  reason: default package */
/* loaded from: classes4.dex */
public final class tbc {
    private static final tdc b = new tbb();
    public static final tev a = new tev();
    private static final tev c = new tev();
    private static final tev d = new tev();

    public static tbl a(ampq ampqVar, final Context context, final azqb azqbVar, final ampq ampqVar2) {
        if (!((Boolean) ampqVar.e(false)).booleanValue()) {
            throw new IllegalStateException("Creating DebuggerCallback when debugger is disabled");
        }
        return (tbl) c.a(new teu() { // from class: tay
            @Override // defpackage.teu
            public final Object a() {
                return new tbl(context, azqbVar, ampqVar2);
            }
        });
    }

    public static DebuggerClient b(ampq ampqVar, final String str, final azqb azqbVar, final Context context) {
        if (!((Boolean) ampqVar.e(false)).booleanValue()) {
            throw new IllegalStateException("Creating DebuggerClient when debugger is disabled");
        }
        return (DebuggerClient) d.a(new teu() { // from class: tba
            @Override // defpackage.teu
            public final Object a() {
                String str2 = str;
                Context context2 = context;
                azqb azqbVar2 = azqbVar;
                String valueOf = String.valueOf(Settings.Secure.getString(context2.getContentResolver(), "android_id"));
                String valueOf2 = String.valueOf(context2.getPackageName());
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                String valueOf3 = String.valueOf(context2.getApplicationInfo().loadLabel(context2.getPackageManager()));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 10);
                sb.append("Android - ");
                sb.append(valueOf3);
                return DebuggerClient.create(str2, concat, sb.toString(), (DebuggerCallback) azqbVar2.get());
            }
        });
    }

    public static tdc c(ampq ampqVar, azqb azqbVar) {
        return !((Boolean) ampqVar.e(false)).booleanValue() ? b : (tdc) azqbVar.get();
    }

    public static String d(ampq ampqVar) {
        return ((String) ampqVar.e("localhost")).concat(":5001");
    }
}
