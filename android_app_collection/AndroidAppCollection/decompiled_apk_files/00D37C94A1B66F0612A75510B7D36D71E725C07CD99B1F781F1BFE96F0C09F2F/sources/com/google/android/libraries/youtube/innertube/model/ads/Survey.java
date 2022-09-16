package com.google.android.libraries.youtube.innertube.model.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Survey implements Parcelable, aall, afto {
    public static final Parcelable.Creator CREATOR;
    public static final aalk a;
    public final osc b;
    private List c;

    static {
        new Survey();
        a = new aalk();
        CREATOR = new aalf(2);
    }

    private Survey() {
        this.b = osc.a;
    }

    @Override // defpackage.aall
    public final List B() {
        SurveyQuestion surveyQuestion;
        if (this.c == null) {
            this.c = new ArrayList();
            for (osd osdVar : this.b.b) {
                List list = this.c;
                aopa mo52toBuilder = osdVar.mo52toBuilder();
                ArrayList arrayList = new ArrayList(osdVar.c);
                ArrayList arrayList2 = new ArrayList(osdVar.f);
                mo52toBuilder.copyOnWrite();
                ((osd) mo52toBuilder.instance).f = aopi.emptyProtobufList();
                mo52toBuilder.copyOnWrite();
                osd osdVar2 = (osd) mo52toBuilder.instance;
                aopu aopuVar = osdVar2.f;
                if (!aopuVar.c()) {
                    osdVar2.f = aopi.mutableCopy(aopuVar);
                }
                aonk.addAll((Iterable) arrayList2, (List) osdVar2.f);
                if (((osd) mo52toBuilder.instance).j.size() <= 0) {
                    int c = osz.c(((osd) mo52toBuilder.instance).e);
                    boolean z = true;
                    if (c == 0) {
                        c = 1;
                    }
                    aalm a2 = aalm.a(c, arrayList);
                    mo52toBuilder.copyOnWrite();
                    ((osd) mo52toBuilder.instance).c = aopi.emptyProtobufList();
                    if (arrayList.size() != a2.a.size()) {
                        z = false;
                    }
                    aqxo.y(z);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList3.add((String) arrayList.get(((Integer) a2.a.get(i)).intValue()));
                    }
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        String str = (String) arrayList3.get(i2);
                        mo52toBuilder.copyOnWrite();
                        osd osdVar3 = (osd) mo52toBuilder.instance;
                        str.getClass();
                        aopu aopuVar2 = osdVar3.c;
                        if (!aopuVar2.c()) {
                            osdVar3.c = aopi.mutableCopy(aopuVar2);
                        }
                        osdVar3.c.add(str);
                    }
                    mo52toBuilder.copyOnWrite();
                    ((osd) mo52toBuilder.instance).j = osd.emptyIntList();
                    List list2 = a2.a;
                    mo52toBuilder.copyOnWrite();
                    osd osdVar4 = (osd) mo52toBuilder.instance;
                    aopq aopqVar = osdVar4.j;
                    if (!aopqVar.c()) {
                        osdVar4.j = aopi.mutableCopy(aopqVar);
                    }
                    aonk.addAll((Iterable) list2, (List) osdVar4.j);
                }
                try {
                    surveyQuestion = new SurveyQuestion((osd) aopi.parseFrom(osd.a, ((osd) mo52toBuilder.mo39build()).toByteArray(), aoos.b()));
                } catch (aopx unused) {
                    surveyQuestion = null;
                }
                list.add(surveyQuestion);
            }
            this.c = Collections.unmodifiableList(this.c);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass().equals(obj.getClass()) && akzj.f(B(), ((Survey) obj).B());
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new aalk(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{B()});
    }

    public final String toString() {
        String valueOf = String.valueOf(B().toString());
        return valueOf.length() != 0 ? "Survey ".concat(valueOf) : new String("Survey ");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.b, parcel);
    }

    public Survey(osc oscVar) {
        oscVar.getClass();
        aqxo.y(oscVar.b.size() > 0);
        this.b = oscVar;
    }
}
