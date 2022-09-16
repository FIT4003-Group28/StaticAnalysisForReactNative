package com.baidu.platform.comapi.map;

import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2091a = "y";

    /* renamed from: b  reason: collision with root package name */
    private x f2092b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Message message) {
        if (message.what != 65289) {
            return;
        }
        int i = message.arg1;
        if (i != 12) {
            switch (i) {
                case -1:
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    switch (i) {
                        case 101:
                        case 102:
                            break;
                        default:
                            return;
                    }
            }
        }
        if (this.f2092b == null) {
            return;
        }
        this.f2092b.a(message.arg1, message.arg2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(x xVar) {
        this.f2092b = xVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(x xVar) {
        this.f2092b = null;
    }
}
