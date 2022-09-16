package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaEdge;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.DebuggerCallback;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.elements.interfaces.FaultSubscription;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: tbl  reason: default package */
/* loaded from: classes4.dex */
public final class tbl extends DebuggerCallback implements Application.ActivityLifecycleCallbacks, tdc {
    public static final /* synthetic */ int d = 0;
    public final Handler a;
    public final tby b;
    public final azqb c;
    private final ampq f;
    private final tbk g;
    private Subscription i;
    private FaultSubscription j;
    private final Set e = new HashSet();
    private final Object h = new Object();
    private final Observer k = new tbh(this);
    private final FaultObserver l = new tbi(this);

    public tbl(Context context, azqb azqbVar, ampq ampqVar) {
        Application application;
        dfz.a = true;
        this.c = azqbVar;
        this.b = new tby();
        this.a = new Handler(Looper.getMainLooper());
        this.f = ampqVar;
        this.g = new tbk(this);
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Application) {
            application = (Application) context;
        } else if (context instanceof Activity) {
            application = ((Activity) context).getApplication();
        } else if (context instanceof Service) {
            application = ((Service) context).getApplication();
        } else {
            throw new IllegalStateException("Could not get Application from context");
        }
        if (application == null) {
            throw new IllegalStateException("Failed to fetch Application");
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public static awqo d(float f, float f2, float f3, float f4) {
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
            return null;
        }
        aopa createBuilder = awqo.a.createBuilder();
        createBuilder.copyOnWrite();
        awqo awqoVar = (awqo) createBuilder.instance;
        awqoVar.b |= 1;
        awqoVar.c = f;
        createBuilder.copyOnWrite();
        awqo awqoVar2 = (awqo) createBuilder.instance;
        awqoVar2.b |= 2;
        awqoVar2.d = f2;
        createBuilder.copyOnWrite();
        awqo awqoVar3 = (awqo) createBuilder.instance;
        awqoVar3.b |= 4;
        awqoVar3.e = f3;
        createBuilder.copyOnWrite();
        awqo awqoVar4 = (awqo) createBuilder.instance;
        awqoVar4.b |= 8;
        awqoVar4.f = f4;
        return (awqo) createBuilder.mo39build();
    }

    public static aopa g(Snapshot snapshot, Set set) {
        aopa createBuilder = awqy.a.createBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            aopa createBuilder2 = awqx.a.createBuilder();
            createBuilder2.copyOnWrite();
            awqx awqxVar = (awqx) createBuilder2.instance;
            str.getClass();
            awqxVar.b |= 1;
            awqxVar.c = str;
            byte[] findNoCopy = snapshot.findNoCopy(str);
            if (findNoCopy != null) {
                aoob x = aoob.x(findNoCopy);
                createBuilder2.copyOnWrite();
                awqx awqxVar2 = (awqx) createBuilder2.instance;
                awqxVar2.b |= 2;
                awqxVar2.d = x;
            }
            awqx awqxVar3 = (awqx) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            awqy awqyVar = (awqy) createBuilder.instance;
            awqxVar3.getClass();
            aopu aopuVar = awqyVar.c;
            if (!aopuVar.c()) {
                awqyVar.c = aopi.mutableCopy(aopuVar);
            }
            awqyVar.c.add(awqxVar3);
        }
        return createBuilder;
    }

    static void h(View view, aopa aopaVar) {
        awqq awqqVar;
        if (view != null && view.isShown()) {
            if (view instanceof dci) {
                dci dciVar = (dci) view;
                String g = tbs.g(dciVar);
                if (g == null) {
                    awqqVar = null;
                } else {
                    final aopa createBuilder = awqq.a.createBuilder();
                    createBuilder.copyOnWrite();
                    awqq awqqVar2 = (awqq) createBuilder.instance;
                    awqqVar2.b |= 1;
                    awqqVar2.d = g;
                    tbs.j(dciVar, new ji() { // from class: tbd
                        @Override // defpackage.ji
                        public final void accept(Object obj) {
                            awqp awqpVar;
                            awqm awqmVar;
                            aopa aopaVar2 = aopa.this;
                            Pair pair = (Pair) obj;
                            int i = tbl.d;
                            int[] iArr = (int[]) pair.first;
                            czt cztVar = (czt) pair.second;
                            Object j = cztVar.j();
                            if (j instanceof tbq) {
                                synchronized (((tbq) j).e) {
                                    awqmVar = ((tbq) j).d;
                                }
                                aopaVar2.copyOnWrite();
                                awqq awqqVar3 = (awqq) aopaVar2.instance;
                                awqq awqqVar4 = awqq.a;
                                awqmVar.getClass();
                                aopu aopuVar = awqqVar3.c;
                                if (!aopuVar.c()) {
                                    awqqVar3.c = aopi.mutableCopy(aopuVar);
                                }
                                awqqVar3.c.add(awqmVar);
                            }
                            String l = cztVar.l();
                            if (l == null) {
                                awqpVar = null;
                            } else {
                                aopa createBuilder2 = awqp.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                awqp awqpVar2 = (awqp) createBuilder2.instance;
                                awqpVar2.b |= 1;
                                awqpVar2.c = l;
                                Rect b = cztVar.b();
                                aopa createBuilder3 = awql.a.createBuilder();
                                int i2 = iArr[0];
                                int i3 = b.left;
                                createBuilder3.copyOnWrite();
                                awql awqlVar = (awql) createBuilder3.instance;
                                awqlVar.b |= 1;
                                awqlVar.c = i2 + i3;
                                int i4 = iArr[1];
                                int i5 = b.top;
                                createBuilder3.copyOnWrite();
                                awql awqlVar2 = (awql) createBuilder3.instance;
                                awqlVar2.b |= 2;
                                awqlVar2.d = i4 + i5;
                                int width = b.width();
                                createBuilder3.copyOnWrite();
                                awql awqlVar3 = (awql) createBuilder3.instance;
                                awqlVar3.b |= 4;
                                awqlVar3.e = width;
                                int height = b.height();
                                createBuilder3.copyOnWrite();
                                awql awqlVar4 = (awql) createBuilder3.instance;
                                awqlVar4.b |= 8;
                                awqlVar4.f = height;
                                awql awqlVar5 = (awql) createBuilder3.mo39build();
                                createBuilder2.copyOnWrite();
                                awqp awqpVar3 = (awqp) createBuilder2.instance;
                                awqlVar5.getClass();
                                awqpVar3.d = awqlVar5;
                                awqpVar3.b |= 2;
                                dna i6 = cztVar.i();
                                awqo d2 = tbl.d(i6.c(YogaEdge.LEFT), i6.c(YogaEdge.TOP), i6.c(YogaEdge.RIGHT), i6.c(YogaEdge.BOTTOM));
                                if (d2 != null) {
                                    createBuilder2.copyOnWrite();
                                    awqp awqpVar4 = (awqp) createBuilder2.instance;
                                    awqpVar4.e = d2;
                                    awqpVar4.b |= 8;
                                }
                                awqo d3 = tbl.d(i6.a(YogaEdge.LEFT), i6.a(YogaEdge.TOP), i6.a(YogaEdge.RIGHT), i6.a(YogaEdge.BOTTOM));
                                if (d3 != null) {
                                    createBuilder2.copyOnWrite();
                                    awqp awqpVar5 = (awqp) createBuilder2.instance;
                                    awqpVar5.f = d3;
                                    awqpVar5.b |= 16;
                                }
                                awqo d4 = tbl.d(i6.d(YogaEdge.LEFT), i6.d(YogaEdge.TOP), i6.d(YogaEdge.RIGHT), i6.d(YogaEdge.BOTTOM));
                                if (d4 != null) {
                                    createBuilder2.copyOnWrite();
                                    awqp awqpVar6 = (awqp) createBuilder2.instance;
                                    awqpVar6.g = d4;
                                    awqpVar6.b |= 32;
                                }
                                awqpVar = (awqp) createBuilder2.mo39build();
                            }
                            if (awqpVar != null) {
                                aopaVar2.copyOnWrite();
                                awqq awqqVar5 = (awqq) aopaVar2.instance;
                                awqq awqqVar6 = awqq.a;
                                aopu aopuVar2 = awqqVar5.e;
                                if (!aopuVar2.c()) {
                                    awqqVar5.e = aopi.mutableCopy(aopuVar2);
                                }
                                awqqVar5.e.add(awqpVar);
                            }
                        }
                    });
                    awqqVar = (awqq) createBuilder.mo39build();
                }
                if (awqqVar == null) {
                    return;
                }
                aopaVar.copyOnWrite();
                awqr awqrVar = (awqr) aopaVar.instance;
                awqr awqrVar2 = awqr.a;
                aopu aopuVar = awqrVar.c;
                if (!aopuVar.c()) {
                    awqrVar.c = aopi.mutableCopy(aopuVar);
                }
                awqrVar.c.add(awqqVar);
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    h(viewGroup.getChildAt(i), aopaVar);
                }
            }
        }
    }

    private final Set i() {
        HashSet hashSet = new HashSet();
        for (Activity activity : this.e) {
            View peekDecorView = activity.getWindow().peekDecorView();
            if (peekDecorView.hasWindowFocus()) {
                hashSet.add(peekDecorView);
            }
        }
        hashSet.addAll(tbs.h());
        return hashSet;
    }

    private final void j() {
        synchronized (this.h) {
            Subscription subscription = this.i;
            if (subscription != null) {
                subscription.cancel();
            }
            FaultSubscription faultSubscription = this.j;
            if (faultSubscription != null) {
                faultSubscription.cancel();
            }
        }
    }

    @Override // defpackage.tdc
    public final boolean a() {
        return true;
    }

    @Override // defpackage.tdc
    public final boolean b() {
        return this.g.a.get();
    }

    public final dci c(String str) {
        for (View view : i()) {
            dci c = tbs.c(view, str);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void configureLiveUpdating(byte[] bArr) {
        try {
            aoos a = aoos.a();
            j();
            if (((awqn) aopi.parseFrom(awqn.a, bArr, a)).b) {
                synchronized (this.h) {
                    this.i = ((ByteStore) ((ampv) this.f).a).subscribe(null, this.k);
                    this.j = ((ByteStore) ((ampv) this.f).a).subscribeToFaults(this.l);
                }
                tbk tbkVar = this.g;
                if (tbkVar.a.getAndSet(true)) {
                    return;
                }
                tbkVar.c.a.post(new tbj(tbkVar));
                return;
            }
            this.g.a();
        } catch (aopx e) {
            Log.w("ElementsDebugger", "Failed to parse ConfigureLiveUpdating message", e);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void connected() {
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void disconnected() {
        j();
        this.g.a();
    }

    public final awqr e() {
        Set<View> i = i();
        Set set = this.e;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!set.isEmpty()) {
            ((Activity) set.iterator().next()).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else if (!i.isEmpty()) {
            ((View) i.iterator().next()).getDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = null;
        }
        if (displayMetrics == null) {
            Log.w("ElementsDebugger", "Could not get DisplayMetrics");
            return null;
        }
        aopa createBuilder = awqr.a.createBuilder();
        aopa createBuilder2 = awql.a.createBuilder();
        createBuilder2.copyOnWrite();
        awql awqlVar = (awql) createBuilder2.instance;
        awqlVar.b |= 1;
        awqlVar.c = 0.0f;
        createBuilder2.copyOnWrite();
        awql awqlVar2 = (awql) createBuilder2.instance;
        awqlVar2.b |= 2;
        awqlVar2.d = 0.0f;
        int i2 = displayMetrics.widthPixels;
        createBuilder2.copyOnWrite();
        awql awqlVar3 = (awql) createBuilder2.instance;
        awqlVar3.b |= 4;
        awqlVar3.e = i2;
        int i3 = displayMetrics.heightPixels;
        createBuilder2.copyOnWrite();
        awql awqlVar4 = (awql) createBuilder2.instance;
        awqlVar4.b |= 8;
        awqlVar4.f = i3;
        awql awqlVar5 = (awql) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        awqr awqrVar = (awqr) createBuilder.instance;
        awqlVar5.getClass();
        awqrVar.d = awqlVar5;
        awqrVar.b |= 1;
        for (View view : i) {
            h(view, createBuilder);
        }
        return (awqr) createBuilder.mo39build();
    }

    public final void f(awqy awqyVar) {
        ((DebuggerClient) this.c.get()).sendStoreSnapshot(awqyVar.toByteArray());
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void getStoreSnapshot() {
        Snapshot snapshot = ((ByteStore) ((ampv) this.f).a).snapshot();
        if (snapshot == null) {
            return;
        }
        f((awqy) g(snapshot, snapshot.keys()).mo39build());
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void highlightElements(byte[] bArr) {
        try {
            final awqw awqwVar = (awqw) aopi.parseFrom(awqw.a, bArr, aoos.a());
            this.a.post(new Runnable() { // from class: tbg
                @Override // java.lang.Runnable
                public final void run() {
                    tbl tblVar = tbl.this;
                    awqw awqwVar2 = awqwVar;
                    tblVar.b.b();
                    for (awqk awqkVar : awqwVar2.b) {
                        dci c = tblVar.c(awqkVar.c);
                        if (c == null) {
                            String valueOf = String.valueOf(awqkVar.c);
                            Log.w("ElementsDebugger", valueOf.length() != 0 ? "Highlight requested for non-existing LithoView: ".concat(valueOf) : new String("Highlight requested for non-existing LithoView: "));
                        } else {
                            czt b = tbs.b(czt.f(c), awqkVar.d);
                            if (b == null) {
                                String valueOf2 = String.valueOf(awqkVar.d);
                                Log.w("ElementsDebugger", valueOf2.length() != 0 ? "Highlight requested for non-existing Component: ".concat(valueOf2) : new String("Highlight requested for non-existing Component: "));
                            } else {
                                tby tbyVar = tblVar.b;
                                dci h = b.h();
                                if (h != null) {
                                    tbx tbxVar = new tbx(b);
                                    tbyVar.a.add(Pair.create(h, tbxVar));
                                    h.addOnAttachStateChangeListener(tbyVar);
                                    h.getOverlay().add(tbxVar);
                                    h.invalidate();
                                }
                            }
                        }
                    }
                }
            });
        } catch (aopx e) {
            Log.w("ElementsDebugger", "Failed to parse PutSelectedElements message", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.e.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.e.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void traverseViewHierarchy() {
        this.a.post(new Runnable() { // from class: tbe
            @Override // java.lang.Runnable
            public final void run() {
                tbl tblVar = tbl.this;
                awqr e = tblVar.e();
                if (e != null) {
                    ((DebuggerClient) tblVar.c.get()).traverseViewHierarchyResponse(e.toByteArray());
                }
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void updateComponentModel(byte[] bArr) {
        try {
            final awqi awqiVar = (awqi) aopi.parseFrom(awqi.a, bArr, aoos.a());
            this.a.post(new Runnable() { // from class: tbf
                @Override // java.lang.Runnable
                public final void run() {
                    tbl tblVar = tbl.this;
                    awqi awqiVar2 = awqiVar;
                    awqk awqkVar = awqiVar2.b;
                    if (awqkVar == null) {
                        awqkVar = awqk.a;
                    }
                    dci c = tblVar.c(awqkVar.c);
                    if (c == null) {
                        String valueOf = String.valueOf(awqkVar.c);
                        Log.w("ElementsDebugger", valueOf.length() != 0 ? "Highlight requested for non-existing LithoView: ".concat(valueOf) : new String("Highlight requested for non-existing LithoView: "));
                        return;
                    }
                    tbq tbqVar = (tbq) tbs.d(c).get(awqkVar.d);
                    if (tbqVar == null) {
                        return;
                    }
                    awnc awncVar = awqiVar2.c;
                    if (awncVar == null) {
                        awncVar = awnc.a;
                    }
                    synchronized (tbqVar.e) {
                        Component component = tbqVar.b;
                        if (component != null) {
                            component.debugSetModel(awncVar.toByteArray());
                        } else {
                            tbqVar.a.c(tet.d(awncVar));
                        }
                    }
                }
            });
        } catch (aopx e) {
            Log.w("ElementsDebugger", "Failed to parse UpdateComponentModel message", e);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void updateStoreEntry(byte[] bArr) {
        try {
            awqz awqzVar = (awqz) aopi.parseFrom(awqz.a, bArr, aoos.a());
            ByteStore byteStore = (ByteStore) ((ampv) this.f).a;
            String str = awqzVar.b;
            aono aonoVar = awqzVar.c;
            if (aonoVar == null) {
                aonoVar = aono.a;
            }
            byteStore.set(str, aonoVar.c.I());
        } catch (aopx e) {
            Log.w("ElementsDebugger", "Failed to parse UpdateStoreEntry message", e);
        }
    }
}
