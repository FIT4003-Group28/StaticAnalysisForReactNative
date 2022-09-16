package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bosm  reason: default package */
/* loaded from: classes3.dex */
public class bosm extends ivn {
    final /* synthetic */ bosn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bosm(bosn bosnVar) {
        super(bosnVar.b.getString(R.string.BUSINESS_HOURS_HEADER), 1, bosnVar.c.a(), bosnVar.b.getString(true != bosnVar.e ? R.string.REPORT_MAP_ISSUE_DONE : R.string.REPORT_MAP_ISSUE_SUBMIT), cjtd.a(dtya.ak), cjtd.a(bosnVar.e ? dtya.am : dtya.al), false, bosnVar.e, bosnVar.m(), true);
        this.a = bosnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivn
    public final void a() {
        bosn bosnVar = this.a;
        if (bosnVar.a.aD) {
            bosnVar.d.b(bosnVar.m());
        }
    }

    @Override // defpackage.ivn, defpackage.jbh
    public void b(cjqm cjqmVar) {
        this.a.g(cjqmVar);
    }
}
