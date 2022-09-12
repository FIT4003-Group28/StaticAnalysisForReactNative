package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* renamed from: bztz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bztz implements dbrn {
    public static final dbrn a = new bztz();

    private bztz() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        eape eapeVar = (eape) obj;
        return String.format(Locale.US, "(%s BETWEEN %d AND %d)", "date_added", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(eapeVar.b)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(eapeVar.c)));
    }
}
