package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.text.NumberFormat;
import java.util.List;
/* compiled from: PG */
/* renamed from: akrx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akrx implements sdj {
    public final /* synthetic */ awsd a;
    public final /* synthetic */ NumberFormat b;
    private final /* synthetic */ int c;

    public /* synthetic */ akrx(awsd awsdVar, NumberFormat numberFormat) {
        this.a = awsdVar;
        this.b = numberFormat;
    }

    public /* synthetic */ akrx(awsd awsdVar, NumberFormat numberFormat, int i) {
        this.c = i;
        this.a = awsdVar;
        this.b = numberFormat;
    }

    @Override // defpackage.sdj
    public final List a(List list) {
        int i = this.c;
        if (i == 0) {
            return (List) Collection.EL.stream(this.a.d).map(new akry(this.b, 2)).collect(Collectors.toList());
        } else if (i == 1) {
            return (List) Collection.EL.stream(this.a.d).map(new akry(this.b)).collect(Collectors.toList());
        } else {
            awsd awsdVar = this.a;
            NumberFormat numberFormat = this.b;
            Stream stream = Collection.EL.stream(awsdVar.d);
            numberFormat.getClass();
            return (List) stream.map(new akry(numberFormat, 1)).collect(Collectors.toList());
        }
    }
}
