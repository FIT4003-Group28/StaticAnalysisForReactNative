package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aell  reason: default package */
/* loaded from: classes.dex */
public final class aell {
    static final zer a = aanz.c;
    static final zer b = aanz.d;
    private static final ampm k = ampm.b(",");
    public final aelf c;
    public final afex d;
    public final aant e;
    public final yrj f;
    public final azqb g;
    public final String h;
    public final ankw i;
    public final afjz j;
    private final adzz l;

    public aell(aeai aeaiVar, aelf aelfVar, afex afexVar, aant aantVar, yrj yrjVar, afjz afjzVar, azqb azqbVar, String str, ankw ankwVar) {
        this.l = aeaiVar;
        this.c = aelfVar;
        this.d = afexVar;
        this.e = aantVar;
        this.f = yrjVar;
        this.j = afjzVar;
        this.g = azqbVar;
        this.h = str;
        this.i = ankwVar;
    }

    private static boolean b(adzz adzzVar, String str, List list, long j) {
        if (!TextUtils.isEmpty(str)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (adzzVar.g(str, ((Integer) it.next()).intValue(), null, TimeUnit.MILLISECONDS.toMicros(j), 0)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri a(defpackage.aele r6, android.net.Uri r7, defpackage.aekg r8, defpackage.aenx r9, java.lang.String r10, java.util.List r11, defpackage.aanr r12) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aell.a(aele, android.net.Uri, aekg, aenx, java.lang.String, java.util.List, aanr):android.net.Uri");
    }
}
