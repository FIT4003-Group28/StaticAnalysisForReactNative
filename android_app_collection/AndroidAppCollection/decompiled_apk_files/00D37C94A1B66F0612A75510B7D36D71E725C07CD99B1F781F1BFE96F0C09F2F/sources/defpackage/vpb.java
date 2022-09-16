package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: vpb  reason: default package */
/* loaded from: classes4.dex */
public final class vpb implements vpm {
    private final qqh a;
    private final String b;
    private final CopyOnWriteArrayList c;
    private final CopyOnWriteArrayList d;
    private final String e;

    public vpb(Context context, String str) {
        qqh qqhVar = new qqh(context, str, null);
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = "";
        if (str.startsWith("STREAMZ_")) {
            this.a = qqhVar;
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
    }

    @Override // defpackage.vpm
    public final void a(vpl vplVar) {
        vpn vpnVar = new vpn(vplVar);
        if (vpnVar.a.b.size() != 0) {
            qqe qqeVar = new qqe(this.a, null, vpnVar);
            qqeVar.i = this.b;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (qqeVar.a.d()) {
                    Log.e("ClearcutLogger", "addMendelPackage forbidden on deidentified logger");
                }
                if (qqeVar.e == null) {
                    qqeVar.e = new ArrayList();
                }
                qqeVar.e.add(str);
            }
            if (!this.e.isEmpty()) {
                String str2 = this.e;
                axiq axiqVar = qqeVar.b;
                axiqVar.copyOnWrite();
                ((axir) axiqVar.instance).s("");
            }
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                qqeVar = ((vpa) it2.next()).a();
            }
            qqeVar.b();
        }
    }
}
