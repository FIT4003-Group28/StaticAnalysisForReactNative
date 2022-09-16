package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: mhv  reason: default package */
/* loaded from: classes3.dex */
public final class mhv extends ajsl {
    private final Context a;
    private final View b;
    private final ajmy c;
    private final ajyc d;
    private final ImageView e;
    private final ajrp f;
    private final ajrx g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final ViewGroup o;
    private final ViewGroup p;
    private final View q;
    private final View r;

    public mhv(Context context, ajmy ajmyVar, ajxz ajxzVar, ajrq ajrqVar, ajyc ajycVar, gem gemVar) {
        this.a = context;
        ajmyVar.getClass();
        this.c = ajmyVar;
        ajxzVar.getClass();
        this.d = ajycVar;
        this.g = gemVar;
        this.f = ajrqVar.a(gemVar);
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_premium_show_item, (ViewGroup) null);
        this.r = inflate;
        this.b = inflate.findViewById(R.id.thumbnail_layout);
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.j = (TextView) inflate.findViewById(R.id.thumbnail_overlay_bottom_panel);
        this.k = (TextView) inflate.findViewById(R.id.thumbnail_bottom_panel);
        this.q = inflate.findViewById(R.id.contextual_menu_anchor);
        this.m = (TextView) inflate.findViewById(R.id.title);
        this.p = (ViewGroup) inflate.findViewById(R.id.top_standalone_badges_container);
        this.l = (TextView) inflate.findViewById(R.id.subtitle);
        this.n = (TextView) inflate.findViewById(R.id.top_metadata);
        this.i = (TextView) inflate.findViewById(R.id.description);
        this.h = (TextView) inflate.findViewById(R.id.bottom_metadata);
        this.o = (ViewGroup) inflate.findViewById(R.id.bottom_standalone_badges_container);
        gemVar.c(inflate);
    }

    private static CharSequence f(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ajgl.b((arag) it.next()));
        }
        return TextUtils.join(System.getProperty("line.separator"), arrayList);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.g).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhv.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqej) obj).o.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.f.c();
    }
}
