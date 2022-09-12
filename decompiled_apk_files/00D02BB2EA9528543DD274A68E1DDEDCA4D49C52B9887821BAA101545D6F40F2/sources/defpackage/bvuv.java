package defpackage;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
/* compiled from: PG */
/* renamed from: bvuv  reason: default package */
/* loaded from: classes4.dex */
final class bvuv extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.message();
        return true;
    }
}
