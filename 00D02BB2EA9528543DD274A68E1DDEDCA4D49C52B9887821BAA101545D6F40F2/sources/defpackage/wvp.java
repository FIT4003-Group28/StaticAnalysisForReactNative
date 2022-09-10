package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wvp  reason: default package */
/* loaded from: classes7.dex */
public class wvp {
    public final HashMap<djpk, HashMap<drhj, drhn>> a = new HashMap<>();
    public final Executor b;
    public final buxb c;

    public wvp(buxb buxbVar, Executor executor) {
        this.c = buxbVar;
        this.b = executor;
    }

    public final HashMap<drhj, drhn> a(djpk djpkVar) {
        return this.a.get(djpkVar);
    }
}
