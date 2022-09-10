package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cri  reason: default package */
/* loaded from: classes5.dex */
public class cri implements ctl {
    public static final cjtd c = cjtd.a(dtxj.Q);
    public final boxa a;
    public final Activity b;
    private final List<dnzx> d;
    private final Context e;
    private final List<ctk> f = new ArrayList();

    public cri(boxa boxaVar, Activity activity, List<dnzx> list, Context context) {
        this.a = boxaVar;
        this.b = activity;
        this.d = list;
        this.e = context;
        for (dnzx dnzxVar : list) {
            this.f.add(new crh(this, dnzxVar));
        }
    }

    @Override // defpackage.ctl
    public List<ctk> a() {
        return this.f;
    }

    @Override // defpackage.ctl
    public CharSequence b() {
        return bqq.c(this.e, R.string.AAP_DUPLICATE_DETECTION_DIALOG_TITLE, "places_count", Integer.valueOf(this.d.size()));
    }

    @Override // defpackage.ctl
    public CharSequence c() {
        return bqq.c(this.e, R.string.AAP_DUPLICATE_DETECTION_DIALOG_CHOOSE_DUPLICATE_SUBHEADER, "places_count", Integer.valueOf(this.d.size()));
    }
}
