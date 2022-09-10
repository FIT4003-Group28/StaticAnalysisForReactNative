package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: arys  reason: default package */
/* loaded from: classes2.dex */
public final class arys implements aryn {
    private final String a;
    private final akra b;
    private final akqi c;

    public arys(String str, akra akraVar, akqi akqiVar) {
        this.a = str;
        this.b = akraVar;
        this.c = akqiVar;
    }

    @Override // defpackage.aryn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aryn
    public final String b() {
        return "";
    }

    @Override // defpackage.aryn
    public final dmqc c() {
        return dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GENERIC;
    }

    @Override // defpackage.aryn
    public final String d() {
        return this.a;
    }

    @Override // defpackage.aryn
    public final String e() {
        return "";
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof arys) {
            arys arysVar = (arys) obj;
            if (dbsd.a(this.a, arysVar.a) && dbsd.a(this.b, arysVar.b) && dbsd.a(this.c, arysVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aryn
    public final akra f() {
        return this.b;
    }

    @Override // defpackage.aryn
    public final akqi g() {
        return this.c;
    }

    @Override // defpackage.aryn
    @dzsi
    public final cjtd h() {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // defpackage.aryn
    public final boolean i() {
        return false;
    }
}
