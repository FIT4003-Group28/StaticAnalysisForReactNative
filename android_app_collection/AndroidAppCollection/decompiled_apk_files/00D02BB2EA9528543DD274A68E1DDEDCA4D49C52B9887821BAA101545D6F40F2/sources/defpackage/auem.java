package defpackage;

import android.app.Activity;
import android.app.Application;
import android.nfc.NfcAdapter;
import java.util.Deque;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: auem  reason: default package */
/* loaded from: classes2.dex */
public final class auem extends itb implements auen {
    private static final dcqe d = dcqe.c("auem");
    public final bvrb a;
    public final akoz b;
    public final Deque<aueo> c = new LinkedList();
    private final Application e;
    private final Activity f;
    private NfcAdapter g;

    public auem(Application application, Activity activity, bvrb bvrbVar, akoz akozVar) {
        this.e = application;
        this.f = activity;
        this.a = bvrbVar;
        this.b = akozVar;
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.g = NfcAdapter.getDefaultAdapter(this.e);
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        NfcAdapter nfcAdapter = this.g;
        if (nfcAdapter != null) {
            nfcAdapter.setNdefPushMessageCallback(new auek(this), this.f, new Activity[0]);
        }
    }

    @Override // defpackage.itb
    public final void Nu() {
        super.Nu();
        if (!this.c.isEmpty()) {
            String canonicalName = this.c.getFirst().getClass().getCanonicalName();
            Object[] objArr = new Object[1];
            if (canonicalName == null) {
                canonicalName = "null";
            }
            objArr[0] = canonicalName;
            bvoo.h("%s", objArr);
            this.c.clear();
        }
    }

    @Override // defpackage.itb
    public final void Po() {
        NfcAdapter nfcAdapter = this.g;
        if (nfcAdapter != null) {
            nfcAdapter.setNdefPushMessageCallback(null, this.f, new Activity[0]);
        }
        super.Po();
    }

    @Override // defpackage.auen
    public final void e(aueo aueoVar) {
        dbsk.s(aueoVar);
        this.c.push(aueoVar);
    }

    @Override // defpackage.auen
    public final void f(aueo aueoVar) {
        dbsk.s(aueoVar);
        this.c.remove(aueoVar);
    }
}
