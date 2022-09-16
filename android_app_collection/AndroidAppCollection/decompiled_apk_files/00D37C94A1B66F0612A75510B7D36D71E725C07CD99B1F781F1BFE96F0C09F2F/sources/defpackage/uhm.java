package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: uhm  reason: default package */
/* loaded from: classes4.dex */
public final class uhm {
    private final Context a;
    private final ucj b;
    private final ampq c;

    public uhm(Context context, ucj ucjVar, ampq ampqVar) {
        this.a = context;
        this.b = ucjVar;
        this.c = ampqVar;
    }

    private static int f() {
        return akg.e() ? 33554432 : 0;
    }

    public final PendingIntent a(String str, int i, String str2, ucp ucpVar, List list, aomr aomrVar, List list2, uip uipVar, aojl aojlVar) {
        aqxo.q(!list2.isEmpty(), "Collaborator intents should not be empty");
        uev.e("PendingIntentHelper", "Creating a collaborator pending intent for action [%s] in account [%s]", str2, ucpVar != null ? ucpVar.b : "null");
        Intent intent = (Intent) arey.s(list2);
        if (akg.d()) {
            if (TextUtils.isEmpty(intent.getIdentifier())) {
                int hashCode = str.hashCode();
                StringBuilder sb = new StringBuilder(19);
                sb.append("chime://");
                sb.append(hashCode);
                intent.setIdentifier(sb.toString());
            }
        } else if (intent.getData() == null || intent.getData().equals(Uri.EMPTY)) {
            int hashCode2 = str.hashCode();
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("chime://");
            sb2.append(hashCode2);
            intent.setData(Uri.parse(sb2.toString()));
        }
        umn.k(intent, ucpVar);
        umn.m(intent, i);
        umn.l(intent, str2);
        umn.r(intent, aomrVar);
        umn.o(intent, uipVar);
        umn.p(intent, aojlVar);
        if (list.size() == 1) {
            umn.q(intent, (ucw) list.get(0));
        } else {
            umn.n(intent, (ucw) list.get(0));
        }
        return PendingIntent.getActivities(this.a, umr.c(str, str2, i), (Intent[]) list2.toArray(new Intent[0]), f() | 134217728);
    }

    public final PendingIntent b(String str, int i, String str2, uhl uhlVar, ucp ucpVar, List list, aomr aomrVar, uip uipVar, uct uctVar, aojl aojlVar, boolean z) {
        uhl uhlVar2;
        uev.e("PendingIntentHelper", "Creating a notification pending intent for action [%s], handler [%s] and handleInForeground [%s] in account [%s]", str2, uhlVar, Boolean.valueOf(z), ucpVar != null ? ucpVar.b : "null");
        Intent className = new Intent("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT").setClassName(this.a, this.b.d.i);
        umn.k(className, ucpVar);
        umn.m(className, i);
        umn.l(className, str2);
        umn.r(className, aomrVar);
        umn.o(className, uipVar);
        if (uctVar != null) {
            className.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_CHIME_ACTION", uctVar.b().toByteArray());
        }
        umn.p(className, aojlVar);
        if (z) {
            uhlVar2 = uhl.ACTIVITY;
            className.putExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", true);
        } else {
            uhlVar2 = uhlVar;
        }
        if (list.size() == 1) {
            umn.q(className, (ucw) list.get(0));
        } else {
            umn.n(className, (ucw) list.get(0));
        }
        if (uhlVar2 != uhl.ACTIVITY) {
            int J2 = akel.J(aomrVar.c);
            if (J2 != 0 && J2 == 5) {
                className.addFlags(268435456);
            }
            return PendingIntent.getBroadcast(this.a, umr.c(str, str2, i), className, f() | 134217728);
        }
        className.setClassName(this.a, this.b.d.h);
        return PendingIntent.getActivity(this.a, umr.c(str, str2, i), className, f() | 134217728);
    }

    public final PendingIntent d(String str, ucp ucpVar, List list, uip uipVar) {
        uir b = ((uis) ((ampv) this.c).a).b(list);
        if (b.b != 1 || b.a == null) {
            return b(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", akg.d() ? uhl.BROADCAST : uhl.ACTIVITY, ucpVar, list, uqb.c(list), uipVar, null, aojl.CLICKED_IN_SYSTEM_TRAY, !((ucw) list.get(0)).d.h.isEmpty());
        }
        return a(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", ucpVar, list, uqb.c(list), b.a, uipVar, aojl.CLICKED_IN_SYSTEM_TRAY);
    }

    public final PendingIntent e(String str, ucp ucpVar, List list) {
        uhl uhlVar = uhl.BROADCAST;
        aopa createBuilder = aomr.a.createBuilder();
        createBuilder.copyOnWrite();
        aomr aomrVar = (aomr) createBuilder.instance;
        aomrVar.f = 2;
        aomrVar.b |= 8;
        createBuilder.copyOnWrite();
        aomr aomrVar2 = (aomr) createBuilder.instance;
        aomrVar2.e = 2;
        aomrVar2.b |= 4;
        return b(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED", uhlVar, ucpVar, list, (aomr) createBuilder.mo39build(), null, null, aojl.DISMISSED_IN_SYSTEM_TRAY, false);
    }

    public final PendingIntent c(String str, ucp ucpVar, ucw ucwVar, uct uctVar, uip uipVar) {
        int i;
        int i2;
        uir uirVar;
        uhl uhlVar;
        int i3 = uctVar.h;
        int i4 = i3 - 1;
        if (i3 != 0) {
            if (i4 != 0) {
                i = i4 != 1 ? i4 != 2 ? i4 != 3 ? 0 : 5 : 4 : 2;
            } else if (uctVar.a.isEmpty()) {
                throw new IllegalStateException("ChimeNotificationAction must have an action id or builtInActionType");
            } else {
                i = 1;
            }
            String valueOf = String.valueOf(uctVar.a);
            String concat = valueOf.length() != 0 ? "com.google.android.libraries.notifications.ACTION_ID:".concat(valueOf) : new String("com.google.android.libraries.notifications.ACTION_ID:");
            if (i != 1) {
                i2 = i;
                uirVar = new uir(2, null);
            } else {
                uirVar = ((uis) ((ampv) this.c).a).a(uctVar);
                i2 = 1;
            }
            if (uirVar.b != 1 || uirVar.a == null) {
                boolean z = !uctVar.d.isEmpty();
                String a = axqq.a.get().a();
                if (!TextUtils.isEmpty(a)) {
                    for (String str2 : amqf.c(",").f(a)) {
                        if (str2.equals(uctVar.a)) {
                            uhlVar = uhl.ACTIVITY;
                            break;
                        }
                    }
                }
                int J2 = akel.J(uctVar.e.c);
                if (J2 == 0 || J2 != 5 || akg.d()) {
                    uhlVar = uhl.BROADCAST;
                } else {
                    uhlVar = uhl.ACTIVITY;
                }
                return b(str, i2, concat, uhlVar, ucpVar, Arrays.asList(ucwVar), uctVar.e, uipVar, uctVar, aojl.ACTION_CLICK_IN_SYSTEM_TRAY, z);
            }
            return a(str, i2, concat, ucpVar, Arrays.asList(ucwVar), uctVar.e, uirVar.a, uipVar, aojl.ACTION_CLICK_IN_SYSTEM_TRAY);
        }
        throw null;
    }
}
