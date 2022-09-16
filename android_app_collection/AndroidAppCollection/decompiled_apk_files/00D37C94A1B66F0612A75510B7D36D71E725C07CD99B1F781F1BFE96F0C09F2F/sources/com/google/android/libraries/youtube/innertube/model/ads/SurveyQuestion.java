package com.google.android.libraries.youtube.innertube.model.ads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class SurveyQuestion implements Parcelable, aalo {
    public static final Parcelable.Creator CREATOR = new aalf(3);
    private final osd a;
    private List b;

    public SurveyQuestion(osd osdVar) {
        osdVar.getClass();
        this.a = osdVar;
        zgh.m(osdVar.b);
        boolean z = true;
        aqxo.y(aaln.a(osdVar.d) != aaln.UNSUPPORTED);
        aqxo.y(osdVar.c.size() <= 0 ? false : z);
    }

    @Override // defpackage.aalo
    public final int a() {
        return this.a.h;
    }

    @Override // defpackage.aalo
    public final int b() {
        return this.a.i;
    }

    public final List c() {
        return Collections.unmodifiableList(this.a.j);
    }

    @Override // defpackage.aalo
    public final aaln d() {
        return aaln.a(this.a.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.aalo
    public final String e() {
        return TextUtils.join(".", this.a.j);
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            SurveyQuestion surveyQuestion = (SurveyQuestion) obj;
            return akzj.f(Integer.valueOf(b()), Integer.valueOf(surveyQuestion.b())) && akzj.f(d(), surveyQuestion.d()) && akzj.f(c(), surveyQuestion.c()) && akzj.f(g(), surveyQuestion.g()) && akzj.f(h(), surveyQuestion.h()) && akzj.f(i(), surveyQuestion.i()) && akzj.f(f(), surveyQuestion.f()) && akzj.f(Integer.valueOf(a()), Integer.valueOf(surveyQuestion.a()));
        }
        return false;
    }

    @Override // defpackage.aalo
    public final String f() {
        return this.a.g;
    }

    @Override // defpackage.aalo
    public final String g() {
        return this.a.b;
    }

    @Override // defpackage.aalo
    public final List h() {
        return Collections.unmodifiableList(this.a.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(b()), d(), c(), g(), h(), i(), f(), Integer.valueOf(a())});
    }

    @Override // defpackage.aalo
    public final List i() {
        this.b = new ArrayList();
        for (String str : this.a.f) {
            this.b.add(Uri.parse(str));
        }
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.aalo
    public final boolean j() {
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(d());
        String g = g();
        String valueOf2 = String.valueOf(h());
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(g).length() + String.valueOf(valueOf2).length());
        sb.append("Question [type: ");
        sb.append(valueOf);
        sb.append("question:\"");
        sb.append(g);
        sb.append("\" answers: ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.a, parcel);
    }
}
