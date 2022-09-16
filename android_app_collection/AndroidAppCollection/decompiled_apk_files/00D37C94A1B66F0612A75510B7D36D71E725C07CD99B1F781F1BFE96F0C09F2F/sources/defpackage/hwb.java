package defpackage;

import android.graphics.Typeface;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: hwb  reason: default package */
/* loaded from: classes3.dex */
final class hwb extends EnumMap {
    public hwb() {
        super(axak.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Typeface a(axak axakVar) {
        Typeface typeface;
        hwa hwaVar = (hwa) get(axakVar);
        if (hwaVar != null) {
            synchronized (hwaVar) {
                typeface = hwaVar.d;
            }
            return typeface;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(axak axakVar, Typeface typeface) {
        hwa hwaVar = (hwa) get(axakVar);
        if (hwaVar != null) {
            synchronized (hwaVar) {
                hwaVar.d = typeface;
            }
        }
    }
}
