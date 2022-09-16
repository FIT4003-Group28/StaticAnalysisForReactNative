package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zpe  reason: default package */
/* loaded from: classes4.dex */
public final class zpe implements zpq, zoz {
    private final zrb A;
    private final zrd B;
    private final haj C;
    public final zpa a;
    public final zpi b;
    public final Graph c;
    public final PacketCreator d;
    public Bitmap g;
    public aoic h;
    public PacketCallback i;
    public List j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final zrc n;
    public zqh o;
    public zqn p;
    private final zpd q;
    private final boolean r;
    private ask u;
    private ask v;
    private zod w;
    private FilterMapTable$FilterDescriptor x;
    private String y;
    private long z;
    private final float[] s = new float[16];
    private final ArrayList t = new ArrayList();
    public final Set e = Collections.newSetFromMap(new HashMap());
    public final Set f = new HashSet();

    public zpe(zpa zpaVar, zpi zpiVar, long j, zpd zpdVar, haj hajVar, boolean z) {
        zpaVar.getClass();
        this.a = zpaVar;
        zpaVar.c = this;
        zpiVar.getClass();
        this.b = zpiVar;
        this.q = zpdVar;
        this.C = hajVar;
        this.r = z;
        Graph i = i();
        this.c = i;
        this.d = new PacketCreator(i);
        if (i != null && j != 0) {
            try {
                i.g(j);
            } catch (MediaPipeException unused) {
            }
        }
        this.x = new FilterMapTable$FilterDescriptor("NORMAL", "", false, true);
        this.y = "NORMAL";
        this.m = true;
        this.n = new zrc();
        this.A = new zrb();
        this.B = new zrd();
    }

    static final Graph i() {
        try {
            return new Graph();
        } catch (UnsatisfiedLinkError unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020a  */
    @Override // defpackage.aoic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.mediapipe.framework.TextureFrame r19) {
        /*
            Method dump skipped, instructions count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpe.a(com.google.mediapipe.framework.TextureFrame):void");
    }

    @Override // defpackage.zoz
    public final void b() {
        this.b.k();
    }

    @Override // defpackage.aoid
    public final void c(aoic aoicVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(List list) {
        List list2 = this.j;
        if (list2 == null) {
            list.getClass();
            this.j = list;
            list.size();
        } else if (list2.size() != list.size()) {
            zep.c("KazooProcessor", "KazooProcessor does not support adding or removing effects at runtime.");
        }
        this.b.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor, Map map) {
        this.x = filterMapTable$FilterDescriptor;
        for (Map.Entry entry : map.entrySet()) {
            zpa zpaVar = this.a;
            float floatValue = ((Float) entry.getValue()).floatValue();
            axci a = axcj.a();
            a.copyOnWrite();
            axcj.c((axcj) a.instance, (String) entry.getKey());
            a.copyOnWrite();
            axcj.d((axcj) a.instance, floatValue);
            axao a2 = axat.a();
            a2.copyOnWrite();
            ((axat) a2.instance).D((axcj) a.mo39build());
            zpaVar.a.add((axat) a2.mo39build());
        }
        this.b.k();
    }

    @Override // defpackage.zpq
    public final void f() {
        this.a.c = null;
        try {
            this.c.d();
        } catch (MediaPipeException unused) {
        }
        try {
            this.c.j();
        } catch (MediaPipeException unused2) {
        }
        zou.i(this.w);
        this.w = null;
        zou.j(this.u);
        this.u = null;
        zou.j(this.v);
        this.v = null;
        this.c.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(String str) {
        FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.j, str);
        if (a != null) {
            this.e.add(a);
            this.b.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        List list = this.j;
        return list != null && !list.isEmpty();
    }
}
