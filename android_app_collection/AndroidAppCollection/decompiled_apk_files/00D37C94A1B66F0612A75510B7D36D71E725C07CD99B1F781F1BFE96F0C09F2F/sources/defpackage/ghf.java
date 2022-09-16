package defpackage;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.util.Pair;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
/* compiled from: PG */
/* renamed from: ghf  reason: default package */
/* loaded from: classes3.dex */
public final class ghf implements NfcAdapter.OnNdefPushCompleteCallback, NfcAdapter.CreateNdefMessageCallback {
    public final azqb a;
    private final Executor b;

    public ghf(azqb azqbVar, Executor executor) {
        this.a = azqbVar;
        this.b = executor;
    }

    @Override // android.nfc.NfcAdapter.CreateNdefMessageCallback
    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        FutureTask futureTask = new FutureTask(new ghe(this));
        this.b.execute(futureTask);
        try {
            Pair pair = (Pair) futureTask.get();
            String str = (String) pair.first;
            if (str == null) {
                return null;
            }
            return new NdefMessage(new NdefRecord[]{new NdefRecord((short) 3, zgt.o(str, "", -1, ((Long) pair.second).longValue() / 1000).toString().getBytes(), new byte[0], new byte[0])});
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // android.nfc.NfcAdapter.OnNdefPushCompleteCallback
    public final void onNdefPushComplete(NfcEvent nfcEvent) {
        zep.g("NFC push completed");
    }
}
