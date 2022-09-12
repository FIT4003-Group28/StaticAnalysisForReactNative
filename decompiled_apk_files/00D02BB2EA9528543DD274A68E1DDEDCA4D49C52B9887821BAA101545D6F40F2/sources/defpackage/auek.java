package defpackage;

import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: auek  reason: default package */
/* loaded from: classes2.dex */
final class auek implements NfcAdapter.CreateNdefMessageCallback {
    final /* synthetic */ auem a;

    public auek(auem auemVar) {
        this.a = auemVar;
    }

    @Override // android.nfc.NfcAdapter.CreateNdefMessageCallback
    @dzsi
    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        auem auemVar = this.a;
        AtomicReference atomicReference = new AtomicReference();
        auemVar.a.c(new auel(auemVar, auemVar.c.peek(), atomicReference), bvrj.UI_THREAD);
        Uri uri = (Uri) atomicReference.get();
        if (uri != null) {
            return new NdefMessage(NdefRecord.createUri(uri), new NdefRecord[0]);
        }
        return null;
    }
}
