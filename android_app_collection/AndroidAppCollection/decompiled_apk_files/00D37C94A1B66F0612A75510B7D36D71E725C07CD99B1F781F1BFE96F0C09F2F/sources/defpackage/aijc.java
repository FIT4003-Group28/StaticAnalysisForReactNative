package defpackage;

import java.util.Observable;
import java.util.Observer;
/* compiled from: PG */
/* renamed from: aijc  reason: default package */
/* loaded from: classes.dex */
public final class aijc extends Observable implements Observer {
    public final afmw a;
    public final afmw b;
    public final afmw c;
    public final afmw d;

    @Deprecated
    public aijc() {
        aijd aijdVar = aijd.a;
        throw null;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        setChanged();
        if (observable == this.a) {
            notifyObservers(0);
        } else if (observable == this.b) {
            notifyObservers(1);
        } else if (observable == this.c) {
            notifyObservers(2);
        } else if (observable != this.d) {
        } else {
            notifyObservers(3);
        }
    }

    public aijc(afmw afmwVar, afmw afmwVar2, afmw afmwVar3, afmw afmwVar4) {
        this(afmwVar, afmwVar2, afmwVar3, afmwVar4, null);
    }

    public aijc(afmw afmwVar, afmw afmwVar2, afmw afmwVar3, afmw afmwVar4, byte[] bArr) {
        afmwVar.getClass();
        this.a = afmwVar;
        afmwVar2.getClass();
        this.b = afmwVar2;
        afmwVar3.getClass();
        this.c = afmwVar3;
        afmwVar4.getClass();
        this.d = afmwVar4;
        afmwVar.addObserver(this);
        afmwVar2.addObserver(this);
        afmwVar3.addObserver(this);
        afmwVar4.addObserver(this);
    }
}
