package android.support.v4.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.y;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
class z implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Notification.Builder f344a;

    /* renamed from: b  reason: collision with root package name */
    private final y.c f345b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteViews f346c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f347d;
    private final List<Bundle> e = new ArrayList();
    private final Bundle f = new Bundle();
    private int g;
    private RemoteViews h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(y.c cVar) {
        this.f345b = cVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f344a = new Notification.Builder(cVar.f336a, cVar.H);
        } else {
            this.f344a = new Notification.Builder(cVar.f336a);
        }
        Notification notification = cVar.M;
        this.f344a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.g).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f338c).setContentText(cVar.f339d).setContentInfo(cVar.i).setContentIntent(cVar.e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.f, (notification.flags & 128) != 0).setLargeIcon(cVar.h).setNumber(cVar.j).setProgress(cVar.q, cVar.r, cVar.s);
        if (Build.VERSION.SDK_INT < 21) {
            this.f344a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f344a.setSubText(cVar.o).setUsesChronometer(cVar.m).setPriority(cVar.k);
            Iterator<y.a> it = cVar.f337b.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            if (cVar.A != null) {
                this.f.putAll(cVar.A);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (cVar.w) {
                    this.f.putBoolean("android.support.localOnly", true);
                }
                if (cVar.t != null) {
                    this.f.putString("android.support.groupKey", cVar.t);
                    if (cVar.u) {
                        this.f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (cVar.v != null) {
                    this.f.putString("android.support.sortKey", cVar.v);
                }
            }
            this.f346c = cVar.E;
            this.f347d = cVar.F;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f344a.setShowWhen(cVar.l);
            if (Build.VERSION.SDK_INT < 21 && cVar.N != null && !cVar.N.isEmpty()) {
                this.f.putStringArray("android.people", (String[]) cVar.N.toArray(new String[cVar.N.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f344a.setLocalOnly(cVar.w).setGroup(cVar.t).setGroupSummary(cVar.u).setSortKey(cVar.v);
            this.g = cVar.L;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f344a.setCategory(cVar.z).setColor(cVar.B).setVisibility(cVar.C).setPublicVersion(cVar.D).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = cVar.N.iterator();
            while (it2.hasNext()) {
                this.f344a.addPerson(it2.next());
            }
            this.h = cVar.G;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f344a.setExtras(cVar.A).setRemoteInputHistory(cVar.p);
            if (cVar.E != null) {
                this.f344a.setCustomContentView(cVar.E);
            }
            if (cVar.F != null) {
                this.f344a.setCustomBigContentView(cVar.F);
            }
            if (cVar.G != null) {
                this.f344a.setCustomHeadsUpContentView(cVar.G);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f344a.setBadgeIconType(cVar.I).setShortcutId(cVar.J).setTimeoutAfter(cVar.K).setGroupAlertBehavior(cVar.L);
            if (cVar.y) {
                this.f344a.setColorized(cVar.x);
            }
            if (TextUtils.isEmpty(cVar.H)) {
                return;
            }
            this.f344a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
    }

    @Override // android.support.v4.app.x
    public Notification.Builder a() {
        return this.f344a;
    }

    public Notification b() {
        Bundle a2;
        RemoteViews d2;
        RemoteViews c2;
        y.d dVar = this.f345b.n;
        if (dVar != null) {
            dVar.a(this);
        }
        RemoteViews b2 = dVar != null ? dVar.b(this) : null;
        Notification c3 = c();
        if (b2 != null) {
            c3.contentView = b2;
        } else if (this.f345b.E != null) {
            c3.contentView = this.f345b.E;
        }
        if (Build.VERSION.SDK_INT >= 16 && dVar != null && (c2 = dVar.c(this)) != null) {
            c3.bigContentView = c2;
        }
        if (Build.VERSION.SDK_INT >= 21 && dVar != null && (d2 = this.f345b.n.d(this)) != null) {
            c3.headsUpContentView = d2;
        }
        if (Build.VERSION.SDK_INT >= 16 && dVar != null && (a2 = y.a(c3)) != null) {
            dVar.a(a2);
        }
        return c3;
    }

    private void a(y.a aVar) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.a(), aVar.b(), aVar.c());
            if (aVar.f() != null) {
                for (RemoteInput remoteInput : ad.a(aVar.f())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (aVar.d() != null) {
                bundle = new Bundle(aVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.e());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.e());
            }
            builder.addExtras(bundle);
            this.f344a.addAction(builder.build());
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.e.add(aa.a(this.f344a, aVar));
        }
    }

    protected Notification c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f344a.build();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Notification build = this.f344a.build();
            if (this.g != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.g == 2) {
                    a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.g == 1) {
                    a(build);
                }
            }
            return build;
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f344a.setExtras(this.f);
            Notification build2 = this.f344a.build();
            if (this.f346c != null) {
                build2.contentView = this.f346c;
            }
            if (this.f347d != null) {
                build2.bigContentView = this.f347d;
            }
            if (this.h != null) {
                build2.headsUpContentView = this.h;
            }
            if (this.g != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.g == 2) {
                    a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.g == 1) {
                    a(build2);
                }
            }
            return build2;
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.f344a.setExtras(this.f);
            Notification build3 = this.f344a.build();
            if (this.f346c != null) {
                build3.contentView = this.f346c;
            }
            if (this.f347d != null) {
                build3.bigContentView = this.f347d;
            }
            if (this.g != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.g == 2) {
                    a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.g == 1) {
                    a(build3);
                }
            }
            return build3;
        } else if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<Bundle> a2 = aa.a(this.e);
            if (a2 != null) {
                this.f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.f344a.setExtras(this.f);
            Notification build4 = this.f344a.build();
            if (this.f346c != null) {
                build4.contentView = this.f346c;
            }
            if (this.f347d != null) {
                build4.bigContentView = this.f347d;
            }
            return build4;
        } else if (Build.VERSION.SDK_INT >= 16) {
            Notification build5 = this.f344a.build();
            Bundle a3 = y.a(build5);
            Bundle bundle = new Bundle(this.f);
            for (String str : this.f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = aa.a(this.e);
            if (a4 != null) {
                y.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            if (this.f346c != null) {
                build5.contentView = this.f346c;
            }
            if (this.f347d != null) {
                build5.bigContentView = this.f347d;
            }
            return build5;
        } else {
            return this.f344a.getNotification();
        }
    }

    private void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
