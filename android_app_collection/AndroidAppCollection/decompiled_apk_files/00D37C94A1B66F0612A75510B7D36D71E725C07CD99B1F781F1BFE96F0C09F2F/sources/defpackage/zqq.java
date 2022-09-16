package defpackage;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketGetter;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.ProcessorBase;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zqq  reason: default package */
/* loaded from: classes4.dex */
public final class zqq implements zpr, vug, zpd, zom {
    public final Rect a;
    public final boolean b;
    public zrp c;
    public final List d;
    public final Map e;
    public zso f;
    public final zqv g;
    public final HandlerThread h;
    public final zou i;
    public final zpe j;
    public ProcessorBase k;
    public zpp l;
    public final HashMap m;
    public volatile boolean n;
    public volatile boolean o;
    public Bitmap p;
    public long q;
    public boolean r;
    Runnable s;
    public final haj t;
    private final zpa u;
    private zuk v;
    private DataSetObserver w;
    private boolean x;
    private final zpg y;
    private zsk z;

    static {
        zoa.a();
    }

    public zqq(Context context, zra zraVar, EGLContext eGLContext) {
        this(context, zraVar, eGLContext, true, null, true);
    }

    public static boolean D() {
        return zoa.a.get();
    }

    private final void F(final zso zsoVar) {
        this.i.o(this.j, new zoo() { // from class: zqg
            @Override // defpackage.zoo
            public final boolean a() {
                zqq zqqVar = zqq.this;
                zso zsoVar2 = zsoVar;
                final zpe zpeVar = zqqVar.j;
                if (zpeVar.m && !zpeVar.k) {
                    byte[] bArr = zsoVar2.a;
                    if (bArr != null) {
                        try {
                            zpeVar.c.e(bArr);
                            zpeVar.j.size();
                            for (int i = 0; i < zpeVar.j.size(); i++) {
                                final String str = ((FilterMapTable$FilterDescriptor) zpeVar.j.get(i)).a;
                                String lowerCase = str.toLowerCase(Locale.US);
                                String format = String.format(Locale.US, "render_%s_preview", lowerCase);
                                String format2 = String.format(Locale.US, "render_%s_thumb", lowerCase);
                                try {
                                    zpeVar.c.b(format, new PacketCallback() { // from class: zpb
                                        @Override // com.google.mediapipe.framework.PacketCallback
                                        public final void process(Packet packet) {
                                            zpe zpeVar2 = zpe.this;
                                            if (zpeVar2.h != null) {
                                                zpeVar2.h.a(PacketGetter.a(packet));
                                            }
                                        }
                                    });
                                    try {
                                        zpeVar.c.b(format2, new PacketCallback() { // from class: zpc
                                            @Override // com.google.mediapipe.framework.PacketCallback
                                            public final void process(Packet packet) {
                                                zpe zpeVar2 = zpe.this;
                                                String str2 = str;
                                                if (zpeVar2.o != null) {
                                                    final GraphTextureFrame a = PacketGetter.a(packet);
                                                    final zqq zqqVar2 = zpeVar2.o.a;
                                                    for (final TextureView textureView : zqqVar2.q(str2)) {
                                                        if (textureView == null || !textureView.isAvailable()) {
                                                            zqqVar2.r(textureView);
                                                        } else {
                                                            zqqVar2.i.b.post(new Runnable() { // from class: zqc
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    zqq zqqVar3 = zqq.this;
                                                                    TextureView textureView2 = textureView;
                                                                    TextureFrame textureFrame = a;
                                                                    SurfaceTexture surfaceTexture = textureView2.getSurfaceTexture();
                                                                    if (zqqVar3.i.d) {
                                                                        if (surfaceTexture == null) {
                                                                            zep.l("renderGpuPacketToTexture: null textureView Surface");
                                                                        } else {
                                                                            zod zodVar = (zod) zqqVar3.m.get(surfaceTexture);
                                                                            if (zodVar == null) {
                                                                                synchronized (zqqVar3.m) {
                                                                                    try {
                                                                                        zodVar = zod.a().b(surfaceTexture);
                                                                                        zqqVar3.m.put(surfaceTexture, zodVar);
                                                                                    } catch (RuntimeException e) {
                                                                                        zep.d("renderGpuPacketToTexture: forSurfaceTexture failed: ", e);
                                                                                    }
                                                                                }
                                                                            }
                                                                            ask a2 = ask.a(((GraphTextureFrame) textureFrame).a);
                                                                            if (zodVar != null) {
                                                                                zou zouVar = zqqVar3.i;
                                                                                zouVar.c.a(a2, zodVar, textureView2.getWidth(), textureView2.getHeight());
                                                                            }
                                                                            zou.j(a2);
                                                                        }
                                                                    }
                                                                    textureFrame.release();
                                                                    zqqVar3.r(textureView2);
                                                                }
                                                            });
                                                        }
                                                    }
                                                }
                                            }
                                        });
                                    } catch (MediaPipeException e) {
                                        String valueOf = String.valueOf(format2);
                                        zep.f("KazooProcessor", valueOf.length() != 0 ? "addPacketCallback failed for stream: ".concat(valueOf) : new String("addPacketCallback failed for stream: "), e);
                                    }
                                } catch (MediaPipeException e2) {
                                    String valueOf2 = String.valueOf(format);
                                    zep.f("KazooProcessor", valueOf2.length() != 0 ? "addPacketCallback failed for stream: ".concat(valueOf2) : new String("addPacketCallback failed for stream: "), e2);
                                }
                            }
                            PacketCallback packetCallback = zpeVar.i;
                            if (packetCallback != null) {
                                try {
                                    zpeVar.c.b("output_events", packetCallback);
                                } catch (MediaPipeException e3) {
                                    zep.f("KazooProcessor", "addPacketCallback failed for stream: output_events", e3);
                                }
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("asset_base", zpeVar.d.b(zsoVar2.b));
                            try {
                                zpeVar.c.f(hashMap);
                                try {
                                    zpeVar.c.h();
                                    zpeVar.k = true;
                                    if (zqqVar.c == null) {
                                        zqqVar.B();
                                        if (zqqVar.C()) {
                                            zqqVar.A();
                                            return true;
                                        }
                                    }
                                    return true;
                                } catch (MediaPipeException e4) {
                                    zep.f("KazooProcessor", "startRunningGraph failed", e4);
                                }
                            } catch (MediaPipeException e5) {
                                zep.f("KazooProcessor", "setInputSidePackets failed", e5);
                            }
                        } catch (MediaPipeException e6) {
                            zep.f("KazooProcessor", "loadBinaryGraph failed", e6);
                        }
                    } else {
                        zep.c("KazooProcessor", "No MediaPipe graph setup provided!");
                    }
                }
                zep.b("KazooProcessor Supergraph setup failed.");
                zqqVar.f = zsoVar2;
                return false;
            }
        });
    }

    public final void A() {
        this.i.b.removeCallbacks(this.s);
        if (this.c == null) {
            this.i.b.postDelayed(this.s, this.q);
        } else {
            zep.b("DrishtiGl: VideoEffectPipelineDrishti.updateAllFilterThumbnailsDelayed ignored");
        }
    }

    public final void B() {
        zuk zukVar = this.v;
        if (zukVar != null) {
            zpe zpeVar = this.j;
            FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(zpeVar.j, zukVar.c);
            if (a == null) {
                return;
            }
            zpeVar.e(a, amyc.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C() {
        /*
            r3 = this;
            zuk r0 = r3.v
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List r0 = r0.e
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor r2 = (com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor) r2
            java.lang.String r2 = r2.a
            android.view.TextureView r2 = r3.p(r2)
            if (r2 == 0) goto L29
            boolean r2 = r2.isAvailable()
            if (r2 != 0) goto Lf
        L29:
            return r1
        L2a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqq.C():boolean");
    }

    public final void E() {
        this.j.l = true;
    }

    @Override // defpackage.zpr
    public final vug a() {
        return this;
    }

    @Override // defpackage.vug
    public final void aF(boolean z) {
        if (this.n) {
            return;
        }
        if (this.o) {
            if (z) {
                this.i.b.removeCallbacks(this.s);
            } else {
                A();
            }
        }
        this.j.n.aF(z);
    }

    @Override // defpackage.zpr
    public final zqv b() {
        return this.g;
    }

    @Override // defpackage.zpr
    public final void c(int i) {
        Handler handler = this.i.b;
        handler.sendMessage(handler.obtainMessage(11, Integer.valueOf(i)));
    }

    @Override // defpackage.zpr
    public final void d(float f) {
        zpe zpeVar = this.j;
        StringBuilder sb = new StringBuilder(45);
        sb.append("setPreviewMinTargetFramerate: ");
        sb.append(f);
        zpeVar.n.a = f;
    }

    @Override // defpackage.zpr
    public final void e(SurfaceTexture surfaceTexture, int i, int i2) {
        boolean z = true;
        aqxo.y(!this.n);
        aqxo.p(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        aqxo.p(z);
        zou zouVar = this.i;
        zouVar.B = null;
        Handler handler = zouVar.b;
        handler.sendMessage(handler.obtainMessage(7, surfaceTexture));
        B();
        this.i.n(i, i2);
        if (this.r) {
            this.i.l();
        }
    }

    @Override // defpackage.zpr
    public final void f(int i, int i2) {
        aqxo.y(!this.n);
        aqxo.p(true);
        aqxo.p(true);
        this.i.n(i, i2);
    }

    @Override // defpackage.zpr
    public final void g(float f) {
        Handler handler = this.i.b;
        handler.sendMessage(handler.obtainMessage(16, Float.valueOf(f)));
    }

    @Override // defpackage.zpr
    public final void h() {
        aqxo.y(!this.n);
        this.o = false;
        if (this.x) {
            this.i.b.sendEmptyMessage(2);
        }
    }

    @Override // defpackage.zpr
    public final void i() {
        zuk zukVar;
        List<FilterMapTable$FilterDescriptor> list;
        aqxo.y(!this.n);
        this.o = false;
        synchronized (this.d) {
            for (zrj zrjVar : this.d) {
                zrjVar.a();
            }
            this.d.clear();
        }
        x(false);
        zpp zppVar = this.l;
        if (zppVar != null) {
            zppVar.c();
            this.l = null;
        }
        zuk zukVar2 = this.v;
        if (zukVar2 != null && (list = zukVar2.e) != null) {
            for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : list) {
                TextureView p = p(filterMapTable$FilterDescriptor.a);
                if (p != null) {
                    p.setSurfaceTextureListener(null);
                }
            }
        }
        DataSetObserver dataSetObserver = this.w;
        if (dataSetObserver != null && (zukVar = this.v) != null) {
            zukVar.unregisterObserver(dataSetObserver);
            this.w = null;
        }
        if (this.x) {
            zou zouVar = this.i;
            synchronized (zouVar.a) {
                zouVar.f = true;
            }
            zouVar.b.sendEmptyMessage(4);
        }
        this.n = true;
    }

    @Override // defpackage.zpr
    public final boolean j() {
        boolean z = true;
        aqxo.y(!this.n);
        this.o = true;
        if (!this.x) {
            this.x = true;
        } else {
            z = false;
        }
        this.i.l();
        return z;
    }

    @Override // defpackage.zpr
    public final zor k() {
        return this.i.k;
    }

    @Override // defpackage.zpr
    public final void l(zsk zskVar, zuk zukVar) {
        boolean z = true;
        aqxo.y(this.z == null);
        if (this.v != null) {
            z = false;
        }
        aqxo.y(z);
        zskVar.getClass();
        this.z = zskVar;
        zukVar.getClass();
        this.v = zukVar;
        zqm zqmVar = new zqm(this);
        this.w = zqmVar;
        zukVar.registerObserver(zqmVar);
        for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : zukVar.e) {
            zukVar.b(filterMapTable$FilterDescriptor.a).setSurfaceTextureListener(new zqp(this, filterMapTable$FilterDescriptor.a));
        }
        List list = zukVar.e;
        zsn zsnVar = zskVar.a;
        t(list, new zso(zsnVar.c, zsnVar.a.d()), zskVar.a.a(avxv.EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS));
    }

    @Override // defpackage.zpr
    public final void m() {
        zqn zqnVar = new zqn();
        this.i.f274J = zqnVar;
        this.j.p = zqnVar;
    }

    @Override // defpackage.zpr
    public final void n(Bitmap bitmap) {
        zor zorVar = this.i.k;
        aqxo.p(true);
        bitmap.getClass();
        zorVar.b = bitmap;
        zorVar.c = Math.round(33.333333333333336d);
        if (zorVar.e.d) {
            zorVar.d.run();
        }
    }

    @Override // defpackage.zpr
    public final void o() {
        this.i.b.sendEmptyMessage(9);
    }

    public final TextureView p(String str) {
        List q = q(str);
        if (!q.isEmpty()) {
            return (TextureView) q.get(0);
        }
        return null;
    }

    public final List q(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        zuk zukVar = this.v;
        if (zukVar != null) {
            arrayList.add(zukVar.b(str));
            return arrayList;
        }
        synchronized (this.e) {
            for (zsq zsqVar : this.e.values()) {
                if (str.equals(zsqVar.a)) {
                    arrayList.add(zsqVar.a());
                }
            }
        }
        return arrayList;
    }

    public final void r(TextureView textureView) {
        zsq zsqVar = (zsq) this.e.remove(textureView);
        if (zsqVar != null) {
            zsqVar.c.a(zsqVar.a);
            if (textureView == null) {
                return;
            }
            u(textureView.getSurfaceTexture());
        }
    }

    public final void s(String str) {
        if (this.r) {
            zep.c("PresetFilterDebug", str);
        }
    }

    public final void t(List list, zso zsoVar, boolean z) {
        aqxo.y(!this.j.h());
        if (list == null) {
            zep.b("No FilterDescriptors provided!");
        } else if (zsoVar == null) {
            zep.b("No Kazoo Supergraph setup provided!");
        } else {
            this.j.d(list);
            zrp zrpVar = this.c;
            if (zrpVar != null) {
                this.d.add(zrpVar.e(new zrm() { // from class: zpu
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        zqq zqqVar = zqq.this;
                        zqqVar.j.e((FilterMapTable$FilterDescriptor) obj, zqqVar.c.g().d);
                    }
                }));
                List list2 = this.d;
                zrp zrpVar2 = this.c;
                final zpe zpeVar = this.j;
                zpeVar.getClass();
                list2.add(zrpVar2.d(new zri() { // from class: zqj
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        zpe zpeVar2 = zpe.this;
                        String str = (String) obj;
                        synchronized (zpeVar2.f) {
                            if (zpeVar2.m) {
                                zpeVar2.a.a(str);
                            } else {
                                zpeVar2.f.add(str);
                            }
                        }
                    }
                }));
                this.d.add(this.c.f(new zrn() { // from class: zpw
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        zqq zqqVar = zqq.this;
                        zsq zsqVar = (zsq) obj;
                        synchronized (zqqVar.e) {
                            zqqVar.e.put(zsqVar.a(), zsqVar);
                        }
                        zqqVar.j.g(zsqVar.a);
                    }
                }));
            }
            if (z) {
                this.j.i = this.y;
            }
            zpe zpeVar2 = this.j;
            zou zouVar = this.i;
            zouVar.getClass();
            zpeVar2.h = new zpy(zouVar);
            this.j.o = new zqh(this);
            F(zsoVar);
        }
    }

    public final void u(SurfaceTexture surfaceTexture) {
        synchronized (this.m) {
            zod zodVar = (zod) this.m.get(surfaceTexture);
            if (zodVar != null) {
                zou.i(zodVar);
                this.m.remove(surfaceTexture);
            }
        }
    }

    public final void v() {
        w(new zql(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(Runnable runnable) {
        this.i.b.post(runnable);
    }

    public final void x(boolean z) {
        zso zsoVar;
        zpe zpeVar = this.j;
        zpeVar.m = z;
        synchronized (zpeVar.f) {
            if (zpeVar.m) {
                for (String str : zpeVar.f) {
                    zpeVar.a.a(str);
                }
                zpeVar.f.clear();
            }
        }
        if (!z || (zsoVar = this.f) == null) {
            return;
        }
        this.f = null;
        F(zsoVar);
    }

    public final void y(final zrp zrpVar) {
        aqxo.y(this.c == null);
        synchronized (this.d) {
            zrpVar.getClass();
            this.c = zrpVar;
            s("VideoEffectPipelineDrishti::setEffectsProvider");
            List list = this.d;
            final zpv zpvVar = new zpv(this, zrpVar, 1);
            synchronized (((zsc) zrpVar).k) {
                zso zsoVar = ((zsc) zrpVar).g;
                if (zsoVar != null) {
                    zpvVar.a(zsoVar);
                } else {
                    zxq.b(((zsc) zrpVar).k, zpvVar);
                }
            }
            final zsc zscVar = (zsc) zrpVar;
            list.add(new zrj(zpvVar, null) { // from class: zrx
                public final /* synthetic */ zpv b;

                @Override // defpackage.zrj
                public final void a() {
                    zsc zscVar2 = zsc.this;
                    zpv zpvVar2 = this.b;
                    synchronized (zscVar2.k) {
                        zscVar2.k.remove(zpvVar2);
                    }
                }
            });
            List list2 = this.d;
            final zro zroVar = new zro() { // from class: zpx
                /* JADX WARN: Type inference failed for: r2v4, types: [zqi, java.lang.Object] */
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    FilterMapTable$FilterDescriptor a;
                    Effect a2;
                    final zqq zqqVar = zqq.this;
                    zrp zrpVar2 = zrpVar;
                    Void r8 = (Void) obj;
                    zqqVar.s("VideoEffectPipelineDrishti::XenoSetupListenerCallback");
                    zqqVar.s("VideoEffectPipelineDrishti::prepareXenoVideoProcessor");
                    awxb awxbVar = new awxb(zqqVar.i.a());
                    zou zouVar = zqqVar.i;
                    zouVar.getClass();
                    awxbVar.c(new zpy(zouVar));
                    zqqVar.i.o(awxbVar, new zoo() { // from class: zqf
                        @Override // defpackage.zoo
                        public final boolean a() {
                            zqq.this.s("VideoEffectPipelineDrishti::setXenoProcessor onSetUp");
                            return true;
                        }
                    });
                    zqqVar.k = awxbVar;
                    List list3 = zqqVar.d;
                    final ?? r2 = new zdt() { // from class: zqi
                        @Override // defpackage.zdt
                        public final void a(Object obj2) {
                            zqq zqqVar2 = zqq.this;
                            final Effect effect = (Effect) obj2;
                            if (zqqVar2.k == null) {
                                zep.l("Set effect called without initialized xenoProcessor.");
                                return;
                            }
                            if (effect == null) {
                                zqqVar2.s("VideoEffectPipelineDrishti::setXenoEffect to bypass mode ");
                            } else {
                                String valueOf = String.valueOf(effect.toString());
                                zqqVar2.s(valueOf.length() != 0 ? "VideoEffectPipelineDrishti::setXenoEffect: ".concat(valueOf) : new String("VideoEffectPipelineDrishti::setXenoEffect: "));
                            }
                            final ProcessorBase processorBase = zqqVar2.k;
                            final zpz zpzVar = new zpz(zqqVar2, effect);
                            long j = 0;
                            if (effect != null && effect.b.get()) {
                                j = effect.a;
                            }
                            ProcessorBase.nativeSetEffect(processorBase.c, j, new ProcessorBase.Callback() { // from class: awxc
                                @Override // com.google.research.xeno.effect.ProcessorBase.Callback
                                public final void onCompletion(boolean z, String str) {
                                    ProcessorBase processorBase2 = ProcessorBase.this;
                                    Effect effect2 = effect;
                                    ProcessorBase.Callback callback = zpzVar;
                                    if (z) {
                                        processorBase2.h = effect2;
                                    } else if (!str.equals("xeno::effect::EffectWasReconfiguredStatus()")) {
                                        processorBase2.h = null;
                                    }
                                    zpz zpzVar2 = (zpz) callback;
                                    zqq zqqVar3 = zpzVar2.a;
                                    Effect effect3 = zpzVar2.b;
                                    if (!z) {
                                        String valueOf2 = String.valueOf(str);
                                        zep.b(valueOf2.length() != 0 ? "Error setting Xeno effect. ".concat(valueOf2) : new String("Error setting Xeno effect. "));
                                        String obj3 = effect3.toString();
                                        StringBuilder sb = new StringBuilder(String.valueOf(obj3).length() + 58 + String.valueOf(str).length());
                                        sb.append("VideoEffectPipelineDrishti::setXenoEffect ERROR: ");
                                        sb.append(obj3);
                                        sb.append(", error: ");
                                        sb.append(str);
                                        zqqVar3.s(sb.toString());
                                    } else if (effect3 == null || effect3.a() == null) {
                                    } else {
                                        boolean z2 = zqqVar3.b;
                                        int intValue = effect3.a().intValue();
                                        Handler handler = zqqVar3.i.b;
                                        handler.sendMessage(handler.obtainMessage(12, Integer.valueOf(intValue + (!z2 ? 1 : 0))));
                                        String valueOf3 = String.valueOf(effect3.toString());
                                        zqqVar3.s(valueOf3.length() != 0 ? "VideoEffectPipelineDrishti::setXenoEffect SUCCESS: ".concat(valueOf3) : new String("VideoEffectPipelineDrishti::setXenoEffect SUCCESS: "));
                                    }
                                }
                            });
                        }
                    };
                    final zsc zscVar2 = (zsc) zrpVar2;
                    synchronized (zscVar2.o) {
                        if (((zsc) zrpVar2).b != null && (a = FilterMapTable$FilterDescriptor.a(((zsc) zrpVar2).s, ((zsc) zrpVar2).u)) != null && (a2 = ((zsc) zrpVar2).b.a(a.a)) != null) {
                            r2.a(a2);
                        }
                        zxq.b(((zsc) zrpVar2).o, r2);
                    }
                    list3.add(new zrj() { // from class: zrt
                        @Override // defpackage.zrj
                        public final void a() {
                            zsc zscVar3 = zsc.this;
                            zqi zqiVar = r2;
                            synchronized (zscVar3.o) {
                                zscVar3.o.remove(zqiVar);
                            }
                        }
                    });
                    List list4 = zqqVar.d;
                    final zpv zpvVar2 = new zpv(zqqVar, zrpVar2);
                    synchronized (zscVar2.j) {
                        Map map = ((zsc) zrpVar2).f;
                        if (map != null) {
                            zpvVar2.a(map);
                        } else {
                            zxq.b(((zsc) zrpVar2).j, zpvVar2);
                        }
                    }
                    list4.add(new zrj() { // from class: zrz
                        @Override // defpackage.zrj
                        public final void a() {
                            zsc zscVar3 = zsc.this;
                            zpv zpvVar3 = zpvVar2;
                            synchronized (zscVar3.j) {
                                zscVar3.j.remove(zpvVar3);
                            }
                        }
                    });
                }
            };
            synchronized (((zsc) zrpVar).l) {
                if (((zsc) zrpVar).x) {
                    zroVar.a(null);
                } else {
                    zxq.b(((zsc) zrpVar).l, zroVar);
                }
            }
            final zsc zscVar2 = (zsc) zrpVar;
            list2.add(new zrj() { // from class: zsa
                @Override // defpackage.zrj
                public final void a() {
                    zsc zscVar3 = zsc.this;
                    zro zroVar2 = zroVar;
                    synchronized (zscVar3.l) {
                        zscVar3.l.remove(zroVar2);
                    }
                }
            });
        }
    }

    public final void z(int i) {
        Handler handler = this.i.b;
        handler.sendMessage(handler.obtainMessage(15, Integer.valueOf(i)));
    }

    public zqq(Context context, zra zraVar, EGLContext eGLContext, boolean z, haj hajVar, boolean z2) {
        this.a = new Rect();
        this.q = 500L;
        this.s = new zql(this);
        context.getClass();
        HandlerThread handlerThread = new HandlerThread(zou.class.getSimpleName());
        this.h = handlerThread;
        handlerThread.start();
        zpa zpaVar = new zpa();
        this.u = zpaVar;
        this.d = new ArrayList();
        this.e = new ConcurrentHashMap();
        zou zouVar = new zou(zraVar, handlerThread.getLooper(), eGLContext, z);
        this.i = zouVar;
        zouVar.y = this;
        aadd bY = ((zqo) antz.u(context, zqo.class)).bY();
        avyk avykVar = bY.a().s;
        int ab = awwc.ab((avykVar == null ? avyk.a : avykVar).h);
        zouVar.K = ab == 0 ? 1 : ab;
        avyk avykVar2 = bY.a().s;
        this.b = (avykVar2 == null ? avyk.a : avykVar2).m;
        this.j = new zpe(zpaVar, zouVar, zouVar.a(), this, hajVar, z2);
        this.t = hajVar;
        this.m = new HashMap();
        zpg zpgVar = new zpg(context);
        this.y = zpgVar;
        this.g = new zqv(zpaVar, zpgVar);
    }
}
