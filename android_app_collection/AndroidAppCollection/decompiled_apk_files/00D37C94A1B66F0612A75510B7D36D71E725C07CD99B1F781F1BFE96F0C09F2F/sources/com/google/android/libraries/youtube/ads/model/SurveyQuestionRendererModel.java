package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SurveyQuestionRendererModel implements Parcelable, aalo {
    public static final Parcelable.Creator CREATOR = new xcg(5);
    private final avct a;
    private List b;
    private List c;

    public SurveyQuestionRendererModel(avct avctVar) {
        avctVar.getClass();
        this.a = avctVar;
    }

    @Override // defpackage.aalo
    public final int a() {
        avcv avcvVar = this.a.f;
        if (avcvVar == null) {
            avcvVar = avcv.a;
        }
        if (avcvVar.b <= 0) {
            return 15;
        }
        avcv avcvVar2 = this.a.f;
        if (avcvVar2 == null) {
            avcvVar2 = avcv.a;
        }
        return avcvVar2.b;
    }

    @Override // defpackage.aalo
    public final int b() {
        return 0;
    }

    public final int c() {
        avcv avcvVar = this.a.f;
        if (avcvVar == null) {
            avcvVar = avcv.a;
        }
        if (avcvVar.c <= 0) {
            return 0;
        }
        avcv avcvVar2 = this.a.f;
        if (avcvVar2 == null) {
            avcvVar2 = avcv.a;
        }
        return avcvVar2.c;
    }

    @Override // defpackage.aalo
    public final aaln d() {
        int i = this.a.e;
        if (i <= 0) {
            return aaln.UNSUPPORTED;
        }
        if (i == 1) {
            return aaln.SINGLE_ANSWERS;
        }
        return aaln.MULTI_SELECT;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.aalo
    public final String e() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SurveyQuestionRendererModel)) {
            return false;
        }
        return akzj.f(this.a, ((SurveyQuestionRendererModel) obj).a);
    }

    @Override // defpackage.aalo
    public final String f() {
        return "";
    }

    @Override // defpackage.aalo
    public final List h() {
        if (this.b == null) {
            this.b = new ArrayList();
            for (arag aragVar : this.a.d) {
                this.b.add(ajgl.b(aragVar).toString());
            }
        }
        return Collections.unmodifiableList(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // defpackage.aalo
    public final boolean j() {
        return this.a.e > 1;
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

    @Override // defpackage.aalo
    public final String g() {
        arag aragVar;
        avct avctVar = this.a;
        int i = avctVar.b & 1;
        if (i == 0) {
            zep.b("Survey question doesn't contain any question text.");
            return "";
        }
        if (i != 0) {
            aragVar = avctVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar).toString();
    }

    @Override // defpackage.aalo
    public final List i() {
        if ((this.a.b & 16) == 0) {
            return Collections.emptyList();
        }
        if (this.c == null) {
            this.c = new ArrayList();
            avcv avcvVar = this.a.f;
            if (avcvVar == null) {
                avcvVar = avcv.a;
            }
            for (apae apaeVar : avcvVar.d) {
                try {
                    this.c.add(zgt.i(apaeVar.c));
                } catch (MalformedURLException unused) {
                    zep.l("Badly formed uri - ignoring");
                }
            }
        }
        return this.c;
    }
}
