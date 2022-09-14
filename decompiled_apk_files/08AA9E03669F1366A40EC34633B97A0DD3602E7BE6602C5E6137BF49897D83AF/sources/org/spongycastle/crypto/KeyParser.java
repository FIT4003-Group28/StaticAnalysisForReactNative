package org.spongycastle.crypto;

import java.io.InputStream;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
/* loaded from: classes.dex */
public interface KeyParser {
    AsymmetricKeyParameter readKey(InputStream inputStream);
}
