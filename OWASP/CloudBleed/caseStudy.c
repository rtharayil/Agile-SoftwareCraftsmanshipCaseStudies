

int Length = ObfuscateEmailAddressesInHtml(&OutputBuffer, CachedPage);
write(fd, OutputBuffer, Length);