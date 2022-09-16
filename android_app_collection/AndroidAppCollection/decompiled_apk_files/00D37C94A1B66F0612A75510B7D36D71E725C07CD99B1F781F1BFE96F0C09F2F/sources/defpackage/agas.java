package defpackage;

import android.content.Intent;
import j$.util.Optional;
import java.util.List;
/* compiled from: PG */
/* renamed from: agas  reason: default package */
/* loaded from: classes.dex */
public final class agas implements uis {
    private final azqb a;

    public agas(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.uis
    public final uir a(uct uctVar) {
        azqb azqbVar = this.a;
        if (azqbVar == null) {
            throw new IllegalStateException("The intent provider for opening the YouTube app is absent.");
        }
        Intent intent = (Intent) azqbVar.get();
        Optional e = agec.e(uctVar);
        if (!e.isPresent()) {
            zep.b("Could not get the YouTube custom payload.");
            return uir.a(amuk.r(intent));
        }
        return (uir) e.flatMap(new agaq(intent, 1)).map(adgi.i).orElseGet(new agar(intent, 1));
    }

    @Override // defpackage.uis
    public final uir b(List list) {
        azqb azqbVar = this.a;
        if (azqbVar == null) {
            throw new IllegalStateException("The intent provider for opening the YouTube app is absent.");
        }
        Intent intent = (Intent) azqbVar.get();
        Optional f = agec.f(list);
        if (!f.isPresent()) {
            zep.b("Could not get the YouTube custom payload.");
            return uir.a(amuk.r(intent));
        }
        return (uir) f.flatMap(new agaq(intent)).map(adgi.j).orElseGet(new agar(intent));
    }
}
