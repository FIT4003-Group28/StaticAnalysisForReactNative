package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextService {
    protected boolean a;
    private long b;

    public TextService() {
        this(TextServiceSwigJNI.new_Service(), true);
        TextServiceSwigJNI.TextService_director_connect(this, this.b, this.a, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TextService(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long getCPtr(TextService textService) {
        if (textService == null) {
            return 0L;
        }
        return textService.b;
    }

    public void cancel(Text text) {
        TextServiceSwigJNI.TextService_cancel(this.b, this, text == null ? null : text.bS());
    }

    public synchronized void delete() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                TextServiceSwigJNI.delete_TextService(j);
            }
            this.b = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public void request(TextRequest textRequest) {
        TextServiceSwigJNI.TextService_request(this.b, this, TextRequest.a(textRequest), textRequest);
    }

    protected void swigDirectorDisconnect() {
        this.a = false;
        delete();
    }
}
