package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crbr  reason: default package */
/* loaded from: classes5.dex */
public final class crbr implements AudioManager.OnAudioFocusChangeListener {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final int b;
    public final Application c;
    public final AudioManager d;
    public final btrm e;
    public final bvjj f;
    public final cjqy g;
    public final cjqq h;
    public final cref i;
    public final crbm j;
    public int k;
    public boolean l;
    public int m;
    @dzsi
    public int n;
    @dzsi
    public int o;
    final crbq p = new crbq(this);
    private final bvrb q;
    private final cqat r;
    private long s;
    private int t;
    @dzsi
    private int u;

    static {
        b = true != anac.c ? 2 : 4;
    }

    public crbr(Application application, cref crefVar, bvjj bvjjVar, btrm btrmVar, cqat cqatVar, crbm crbmVar, cjqy cjqyVar, cjqq cjqqVar, bvrb bvrbVar) {
        this.c = application;
        this.i = crefVar;
        dbsk.s(bvjjVar);
        this.f = bvjjVar;
        dbsk.s(btrmVar);
        this.e = btrmVar;
        this.r = cqatVar;
        this.j = crbmVar;
        this.d = (AudioManager) application.getSystemService("audio");
        this.g = cjqyVar;
        this.h = cjqqVar;
        this.q = bvrbVar;
        this.m = 2;
        this.t = 1;
    }

    public static crbr a(Application application, cref crefVar, bvjj bvjjVar, btrm btrmVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, bvrb bvrbVar) {
        arv arvVar;
        if (application == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        arv.a();
        if (arv.a == null) {
            arv.a = new arm(application.getApplicationContext());
            arm armVar = arv.a;
            armVar.e(armVar.i);
            aql aqlVar = armVar.c;
            if (aqlVar != null) {
                armVar.e(aqlVar);
            }
            armVar.j = new asz(armVar.a, armVar);
            asz aszVar = armVar.j;
            if (!aszVar.d) {
                aszVar.d = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                aszVar.a.registerReceiver(aszVar.e, intentFilter, null, aszVar.c);
                aszVar.c.post(aszVar.f);
            }
        }
        arm armVar2 = arv.a;
        int size = armVar2.d.size();
        while (true) {
            size--;
            if (size >= 0) {
                arvVar = armVar2.d.get(size).get();
                if (arvVar == null) {
                    armVar2.d.remove(size);
                } else if (arvVar.b == application) {
                    break;
                }
            } else {
                arvVar = new arv(application);
                armVar2.d.add(new WeakReference<>(arvVar));
                break;
            }
        }
        crbr crbrVar = new crbr(application, crefVar, bvjjVar, btrmVar, cqatVar, new crbo(bvjjVar, arvVar), cjqyVar, cjqqVar, bvrbVar);
        btrm btrmVar2 = crbrVar.e;
        dceq a2 = dcet.a();
        a2.b(brcp.class, new crbs(0, brcp.class, crbrVar, bvrj.UI_THREAD));
        a2.b(crhp.class, new crbs(1, crhp.class, crbrVar, bvrj.UI_THREAD));
        btrmVar2.g(crbrVar, a2.a());
        crbrVar.f(1);
        ((crbo) crbrVar.j).f = crbrVar.p;
        return crbrVar;
    }

    private final void h(int i, int i2) {
        if (i != this.n) {
            this.n = i;
            this.o = i2;
            this.e.b(new creu(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        int i = this.u;
        if (i == 0 || i == 1) {
            return false;
        }
        if (this.r.e() - this.s < a) {
            return true;
        }
        g(1);
        bvoo.k(new Exception("GSA audio state is stuck in a state other than IDLE for too long"));
        return false;
    }

    public final boolean c() {
        return this.u == 4 && (crej.RESPONSE == this.i.w() || crej.RESPONSE_KEEP_PLAYING_ON_STOP_NAVIGATION == this.i.w());
    }

    public final boolean d(crej crejVar, int i) {
        int requestAudioFocus;
        AudioAttributes build;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioManager audioManager = this.d;
            AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(i);
            int i2 = crejVar.k.h - 1;
            if (i2 == 0) {
                build = new AudioAttributes.Builder().setUsage(12).setContentType(1).build();
            } else if (i2 == 1) {
                build = new AudioAttributes.Builder().setUsage(16).setContentType(1).build();
            } else if (i2 == 2) {
                build = new AudioAttributes.Builder().setUsage(10).setContentType(1).build();
            } else {
                build = new AudioAttributes.Builder().setUsage(0).setContentType(0).build();
            }
            requestAudioFocus = audioManager.requestAudioFocus(builder.setAudioAttributes(build).setOnAudioFocusChangeListener(this).build());
        } else {
            requestAudioFocus = this.d.requestAudioFocus(this, 3, i);
        }
        return requestAudioFocus == 1;
    }

    public final void e() {
        this.d.abandonAudioFocus(this);
        this.m = 2;
    }

    public final void f(int i) {
        synchronized (this.i) {
            this.t = i;
            if (!b() || c()) {
                h(i, 1);
            }
        }
    }

    public final void g(int i) {
        this.u = i;
        this.s = this.r.e();
        int i2 = 4;
        if (i == 1) {
            if (this.n == 4) {
                this.n = this.t;
                this.o = 1;
                this.q.a(new Runnable(this) { // from class: crbp
                    private final crbr a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        crbr crbrVar = this.a;
                        synchronized (crbrVar.i) {
                            int i3 = crbrVar.n;
                            if (i3 != 0 && crbrVar.o != 0) {
                                crbrVar.e.b(new creu(i3));
                            }
                        }
                    }
                }, bvrj.UI_THREAD, 100L);
                return;
            }
            h(this.t, 1);
            return;
        }
        this.i.t();
        int i3 = i - 1;
        if (i3 == 1) {
            i2 = 2;
        } else if (i3 == 2) {
            i2 = 3;
        } else if (i3 != 3) {
            i2 = 7;
        }
        h(i2, 2);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
    }
}
