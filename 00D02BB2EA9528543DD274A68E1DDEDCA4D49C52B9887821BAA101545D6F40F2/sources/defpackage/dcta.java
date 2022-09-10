package defpackage;

import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcta  reason: default package */
/* loaded from: classes.dex */
public final class dcta extends dcsn {
    private final String a;

    public dcta(String str) {
        super(str);
        this.a = "";
    }

    @Override // defpackage.dcrl
    public final boolean b(Level level) {
        return true;
    }

    @Override // defpackage.dcrl
    public final void c(dcrj dcrjVar) {
        String str = (String) dcrjVar.l().e(dcrd.a);
        if (str == null) {
            str = a();
        }
        if (str == null) {
            str = dcrjVar.g().a();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        dcsv.a(this.a, str, true);
        dcrjVar.d();
        dctb.e(dcrjVar, true);
    }
}
