package defpackage;

import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anct  reason: default package */
/* loaded from: classes.dex */
public final class anct extends ancg {
    private final Level a;

    public anct(String str, Level level) {
        super(str);
        this.a = level;
    }

    @Override // defpackage.anbf
    public final void c(anbe anbeVar) {
        String str = (String) anbeVar.j().d(anaz.a);
        if (str == null) {
            str = a();
        }
        if (str == null) {
            str = anbeVar.f().b();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        ancu.e(anbeVar, ancv.e(str), this.a);
    }

    @Override // defpackage.anbf
    public final boolean d(Level level) {
        return true;
    }
}
