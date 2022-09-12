package defpackage;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
/* compiled from: PG */
/* renamed from: csdg  reason: default package */
/* loaded from: classes5.dex */
public final class csdg extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.message();
        return true;
    }
}
