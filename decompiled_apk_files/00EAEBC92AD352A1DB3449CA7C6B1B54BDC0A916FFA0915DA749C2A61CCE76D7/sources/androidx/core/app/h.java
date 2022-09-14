package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.g;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Notification.Builder f1538a;

    /* renamed from: b  reason: collision with root package name */
    private final g.e f1539b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteViews f1540c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f1541d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Bundle> f1542e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f1543f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    private int f1544g;

    /* renamed from: h  reason: collision with root package name */
    private RemoteViews f1545h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(g.e eVar) {
        Icon icon;
        List<String> a2;
        Bundle bundle;
        String str;
        this.f1539b = eVar;
        this.f1538a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(eVar.f1526a, eVar.K) : new Notification.Builder(eVar.f1526a);
        Notification notification = eVar.S;
        this.f1538a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1530e).setContentText(eVar.f1531f).setContentInfo(eVar.k).setContentIntent(eVar.f1532g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1533h, (notification.flags & 128) != 0).setLargeIcon(eVar.j).setNumber(eVar.l).setProgress(eVar.t, eVar.u, eVar.v);
        if (Build.VERSION.SDK_INT < 21) {
            this.f1538a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1538a.setSubText(eVar.q).setUsesChronometer(eVar.o).setPriority(eVar.m);
            Iterator<g.a> it = eVar.f1527b.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Bundle bundle2 = eVar.D;
            if (bundle2 != null) {
                this.f1543f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.z) {
                    this.f1543f.putBoolean("android.support.localOnly", true);
                }
                String str2 = eVar.w;
                if (str2 != null) {
                    this.f1543f.putString("android.support.groupKey", str2);
                    if (eVar.x) {
                        bundle = this.f1543f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f1543f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = eVar.y;
                if (str3 != null) {
                    this.f1543f.putString("android.support.sortKey", str3);
                }
            }
            this.f1540c = eVar.H;
            this.f1541d = eVar.I;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1538a.setShowWhen(eVar.n);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 21 && (a2 = a(a(eVar.f1528c), eVar.V)) != null && !a2.isEmpty()) {
            this.f1543f.putStringArray("android.people", (String[]) a2.toArray(new String[a2.size()]));
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f1538a.setLocalOnly(eVar.z).setGroup(eVar.w).setGroupSummary(eVar.x).setSortKey(eVar.y);
            this.f1544g = eVar.P;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1538a.setCategory(eVar.C).setColor(eVar.E).setVisibility(eVar.F).setPublicVersion(eVar.G).setSound(notification.sound, notification.audioAttributes);
            List<String> a3 = Build.VERSION.SDK_INT < 28 ? a(a(eVar.f1528c), eVar.V) : eVar.V;
            if (a3 != null && !a3.isEmpty()) {
                for (String str4 : a3) {
                    this.f1538a.addPerson(str4);
                }
            }
            this.f1545h = eVar.J;
            if (eVar.f1529d.size() > 0) {
                Bundle bundle3 = eVar.b().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i2 = 0; i2 < eVar.f1529d.size(); i2++) {
                    bundle5.putBundle(Integer.toString(i2), i.a(eVar.f1529d.get(i2)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.b().putBundle("android.car.EXTENSIONS", bundle3);
                this.f1543f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && (icon = eVar.U) != null) {
            this.f1538a.setSmallIcon(icon);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1538a.setExtras(eVar.D).setRemoteInputHistory(eVar.s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                this.f1538a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                this.f1538a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                this.f1538a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1538a.setBadgeIconType(eVar.L).setSettingsText(eVar.r).setShortcutId(eVar.M).setTimeoutAfter(eVar.O).setGroupAlertBehavior(eVar.P);
            if (eVar.B) {
                this.f1538a.setColorized(eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f1538a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Iterator<k> it2 = eVar.f1528c.iterator();
            while (it2.hasNext()) {
                this.f1538a.addPerson(it2.next().h());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1538a.setAllowSystemGeneratedContextualActions(eVar.Q);
            this.f1538a.setBubbleMetadata(g.d.a(eVar.R));
            a.g.e.d dVar = eVar.N;
            if (dVar != null) {
                dVar.a();
                throw null;
            }
        }
        if (eVar.T) {
            if (this.f1539b.x) {
                this.f1544g = 2;
            } else {
                this.f1544g = 1;
            }
            this.f1538a.setVibrate(null);
            this.f1538a.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.f1538a.setDefaults(notification.defaults);
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            if (TextUtils.isEmpty(this.f1539b.w)) {
                this.f1538a.setGroup("silent");
            }
            this.f1538a.setGroupAlertBehavior(this.f1544g);
        }
    }

    private static List<String> a(List<k> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (k kVar : list) {
            arrayList.add(kVar.g());
        }
        return arrayList;
    }

    private static List<String> a(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        a.e.b bVar = new a.e.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    private void a(g.a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            if (i < 16) {
                return;
            }
            this.f1542e.add(i.a(this.f1538a, aVar));
            return;
        }
        IconCompat e2 = aVar.e();
        Notification.Action.Builder builder = Build.VERSION.SDK_INT >= 23 ? new Notification.Action.Builder(e2 != null ? e2.f() : null, aVar.i(), aVar.a()) : new Notification.Action.Builder(e2 != null ? e2.a() : 0, aVar.i(), aVar.a());
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : l.a(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        if (Build.VERSION.SDK_INT >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.f1538a.addAction(builder.build());
    }

    @Override // androidx.core.app.f
    public Notification.Builder a() {
        return this.f1538a;
    }

    public Notification b() {
        Bundle a2;
        RemoteViews d2;
        RemoteViews b2;
        g.f fVar = this.f1539b.p;
        if (fVar != null) {
            fVar.a(this);
        }
        RemoteViews c2 = fVar != null ? fVar.c(this) : null;
        Notification c3 = c();
        if (c2 != null || (c2 = this.f1539b.H) != null) {
            c3.contentView = c2;
        }
        if (Build.VERSION.SDK_INT >= 16 && fVar != null && (b2 = fVar.b(this)) != null) {
            c3.bigContentView = b2;
        }
        if (Build.VERSION.SDK_INT >= 21 && fVar != null && (d2 = this.f1539b.p.d(this)) != null) {
            c3.headsUpContentView = d2;
        }
        if (Build.VERSION.SDK_INT >= 16 && fVar != null && (a2 = g.a(c3)) != null) {
            fVar.a(a2);
        }
        return c3;
    }

    protected Notification c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f1538a.build();
        }
        if (i >= 24) {
            Notification build = this.f1538a.build();
            if (this.f1544g != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f1544g == 2) {
                    a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f1544g == 1) {
                    a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f1538a.setExtras(this.f1543f);
            Notification build2 = this.f1538a.build();
            RemoteViews remoteViews = this.f1540c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1541d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f1545h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f1544g != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f1544g == 2) {
                    a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f1544g == 1) {
                    a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f1538a.setExtras(this.f1543f);
            Notification build3 = this.f1538a.build();
            RemoteViews remoteViews4 = this.f1540c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1541d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f1544g != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.f1544g == 2) {
                    a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f1544g == 1) {
                    a(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a2 = i.a(this.f1542e);
            if (a2 != null) {
                this.f1543f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.f1538a.setExtras(this.f1543f);
            Notification build4 = this.f1538a.build();
            RemoteViews remoteViews6 = this.f1540c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1541d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f1538a.getNotification();
        } else {
            Notification build5 = this.f1538a.build();
            Bundle a3 = g.a(build5);
            Bundle bundle = new Bundle(this.f1543f);
            for (String str : this.f1543f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = i.a(this.f1542e);
            if (a4 != null) {
                g.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = this.f1540c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f1541d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
