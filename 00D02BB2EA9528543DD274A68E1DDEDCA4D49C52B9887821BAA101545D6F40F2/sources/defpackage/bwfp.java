package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import com.google.android.apps.gmm.sharing.SendTextToClipboardActivity;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: bwfp  reason: default package */
/* loaded from: classes4.dex */
public class bwfp extends DataSetObservable {
    public static final /* synthetic */ int c = 0;
    private static final dcep<String> d = dcep.G("8bf6213b48bb5f409f32ca7b814b0bf3defec5df", "7cc30a94171d6f310f8d3e1138f09c2f239396eb", "f0a06884a0fc3c75f72e71926e3473aa47a613b2", "68ec5572ed19b90ad259d929c3ac68cefc1578b1", "133fdd1f9ba5e4a05551248a753dc2e6ad6eee39", "6bcbd0b8ace6b8914de822c1c671b6f0e3600a41", "22d4ef1d22f0db3a4967cc8742d1717ca804a38a", "26ef768e5c3edb79d67351e9aa7f2b035ec28f25", "c3bf0a66b66bfc558ec5042a7d072278a1c10ef3", "b85d0ce6f00dfc2deae3a888f3bd5509aa2b6470");
    private static final Object e = new Object();
    private static final Map<String, bwfp> f = new HashMap();
    @dzsi
    private static Boolean g;
    public final Context a;
    public final String b;
    private boolean k;
    private Intent l;
    private final Object h = new Object();
    private final List<bwfk> i = new ArrayList();
    private final List<bwfn> j = new ArrayList();
    private final bwfl m = new bwfm();
    private boolean n = true;
    private boolean o = false;
    private boolean p = true;
    private boolean q = false;
    private boolean r = false;

    private bwfp(Context context, String str, boolean z) {
        this.a = context.getApplicationContext();
        this.k = z;
        TextUtils.isEmpty("share_history.xml");
        this.b = "share_history.xml";
    }

    public static bwfp f(Context context, boolean z) {
        bwfp bwfpVar;
        synchronized (e) {
            Map<String, bwfp> map = f;
            bwfpVar = map.get("share_history.xml");
            if (bwfpVar == null) {
                bwfpVar = new bwfp(context, "share_history.xml", z);
                map.put("share_history.xml", bwfpVar);
            }
            synchronized (bwfpVar.h) {
                bwfpVar.k = z;
            }
        }
        return bwfpVar;
    }

    private final void h() {
        boolean z;
        boolean z2 = true;
        if (!this.q || this.l == null) {
            z = false;
        } else {
            this.q = false;
            this.i.clear();
            List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(this.l, 0);
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                ResolveInfo resolveInfo = queryIntentActivities.get(i);
                if (!d.contains(j(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name).toString())) && resolveInfo.activityInfo.exported) {
                    this.i.add(new bwfk(resolveInfo));
                }
            }
            if (this.r && "android.intent.action.SEND".equals(this.l.getAction())) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(this.a, SendTextToClipboardActivity.class));
                ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(intent, 0);
                if (resolveActivity != null) {
                    this.i.add(new bwfk(resolveActivity));
                }
            }
            z = true;
        }
        if (!this.n || !this.p || TextUtils.isEmpty(this.b)) {
            z2 = false;
        } else {
            this.n = false;
            this.o = true;
            k();
        }
        i();
        if (z || z2) {
            m();
            notifyChanged();
        }
    }

    private final void i() {
        int size = this.j.size() - 50;
        if (size <= 0) {
            return;
        }
        this.p = true;
        for (int i = 0; i < size; i++) {
            this.j.remove(0);
        }
    }

    private static String j(String str) {
        return dczc.a.a(str, dbrc.c).toString();
    }

    private final void k() {
        try {
            FileInputStream openFileInput = this.a.openFileInput(this.b);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<bwfn> list = this.j;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                            try {
                                openFileInput.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        } else if (next != 3 && next != 4) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                String attributeValue = newPullParser.getAttributeValue(null, "activity");
                                list.add(new bwfn(ComponentName.unflattenFromString(attributeValue), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (IOException unused2) {
                if (openFileInput == null) {
                    return;
                }
                try {
                    openFileInput.close();
                } catch (IOException unused3) {
                }
            } catch (XmlPullParserException unused4) {
                if (openFileInput == null) {
                    return;
                }
                openFileInput.close();
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException | IOException unused6) {
        }
    }

    private final void l(bwfn bwfnVar) {
        if (this.j.add(bwfnVar)) {
            this.p = true;
            i();
            if (this.o) {
                if (this.p) {
                    this.p = false;
                    if (!TextUtils.isEmpty(this.b)) {
                        new bwfo(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.j), this.b);
                    }
                }
                m();
                notifyChanged();
                return;
            }
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
    }

    private final void m() {
        if (this.m == null || this.l == null || this.i.isEmpty()) {
            return;
        }
        if (this.k) {
            this.m.a(this.i, Collections.emptyList());
        } else {
            this.m.a(this.i, Collections.unmodifiableList(this.j));
        }
    }

    public final dcdc<ResolveInfo> a(@dzsi btlu btluVar) {
        boolean booleanValue;
        dcdc<ResolveInfo> f2;
        synchronized (this.h) {
            h();
            boolean n = btlu.n(btluVar);
            Context context = this.a;
            Boolean bool = g;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
                List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
                if (activeAdmins != null) {
                    for (ComponentName componentName : activeAdmins) {
                        if (devicePolicyManager.isProfileOwnerApp(componentName.getPackageName())) {
                            Boolean bool2 = true;
                            g = bool2;
                            booleanValue = bool2.booleanValue();
                            break;
                        }
                    }
                }
                Boolean bool3 = false;
                g = bool3;
                booleanValue = bool3.booleanValue();
            }
            dccx F = dcdc.F();
            for (bwfk bwfkVar : this.i) {
                ResolveInfo resolveInfo = bwfkVar.a;
                if (!n || !booleanValue || !"14685f2aee351ac5cfbdb56028839b1c12c1b374".equals(j(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name).toString()))) {
                    F.g(bwfkVar.a);
                }
            }
            f2 = F.f();
        }
        return f2;
    }

    @dzsi
    public final Intent b(ResolveInfo resolveInfo) {
        ComponentName componentName;
        synchronized (this.h) {
            if (this.l == null) {
                return null;
            }
            h();
            ComponentName componentName2 = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            Iterator<bwfk> it = this.i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    componentName = null;
                    break;
                }
                bwfk next = it.next();
                componentName = new ComponentName(next.a.activityInfo.packageName, next.a.activityInfo.name);
                if (componentName.equals(componentName2)) {
                    break;
                }
            }
            if (componentName == null) {
                return null;
            }
            Intent intent = new Intent(this.l);
            intent.setComponent(componentName);
            return intent;
        }
    }

    public final void c(Intent intent) {
        bwfn bwfnVar = new bwfn(intent.getComponent(), System.currentTimeMillis(), 1.0f);
        synchronized (this.h) {
            l(bwfnVar);
        }
    }

    public final void d(Intent intent) {
        bwfn bwfnVar = new bwfn(intent.getComponent(), System.currentTimeMillis(), -5.0f);
        synchronized (this.h) {
            l(bwfnVar);
        }
    }

    public final void g(Intent intent) {
        synchronized (this.h) {
            if (this.l == intent && this.r) {
                return;
            }
            this.l = intent;
            this.r = true;
            this.q = true;
            h();
        }
    }
}
